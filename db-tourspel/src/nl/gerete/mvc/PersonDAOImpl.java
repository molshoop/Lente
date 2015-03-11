package nl.gerete.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by marc on 3/11/15.
 */
public class PersonDAOImpl implements PersonDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(PersonsEntity p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<PersonsEntity> list() {
        Session session = this.sessionFactory.openSession();
        List<PersonsEntity> personList = session.createQuery("from PersonsEntity ").list();
        session.close();
        return personList;
    }}
