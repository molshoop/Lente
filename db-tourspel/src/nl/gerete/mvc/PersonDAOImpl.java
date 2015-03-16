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
	public List<PersonsEntity> listPersons() {
		Session session = m_sessionFactory.openSession();
		List<PersonsEntity> personList = session.createQuery("from nl.gerete.mvc.PersonsEntity ").list();
		session.close();
		return personList;
	}
}
