package nl.gerete.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by marc on 3/11/15.
 */
public class PersonDAOImpl implements PersonDAO {

	private SessionFactory m_sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		m_sessionFactory = sessionFactory;
	}

	@Override
	public void save(PersonsEntity p) {
		Session session = m_sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@Override
	public void edit(PersonsEntity p) {
		//TODO Kunnen we hier iets met Transactional doen? Wat doet dat eigenlijk?
		//TODO stylesheet aanmaken
		//TODO Rennerslijst toevoegen
		Session session = m_sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}

	@Override
	public List<PersonsEntity> listPersons() {
		Session session = m_sessionFactory.openSession();
		List<PersonsEntity> personList = session.createQuery("from nl.gerete.mvc.PersonsEntity ").list();
		session.close();
		return personList;
	}

    @Override
    public void delete(Long id) {
        Session session = m_sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        PersonsEntity person = (PersonsEntity) session.load(PersonsEntity.class, id);
        session.delete(person);
        tx.commit();
        session.close();
    }

	@Override
	public PersonsEntity getPersonById(Long id) {
		Session session = m_sessionFactory.openSession();
		PersonsEntity personsEntity = (PersonsEntity) session.load(PersonsEntity.class, id);
		System.out.println("personsEntity = " + personsEntity.getLastname()); //FIXME Hibernate.initialize toepassen? Of Filter.. inbouwen
		session.close();
		return personsEntity;
	}
}
