package nl.gerete.mvc;

import org.springframework.transaction.annotation.*;

import java.util.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/14/15.
 */
public class PersonServiceImpl implements PersonService {

	private PersonDAO m_personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		m_personDAO = personDAO;
	}

	@Override
	public void savePerson(PersonsEntity p) {
		m_personDAO.save(p);
	}

	@Override
	@Transactional
	public List<PersonsEntity> listPersons() {
		return m_personDAO.listPersons();
	}

    @Override
    public void deletePerson(Long id) {
        System.out.println("Delete person = "+ id);
        m_personDAO.delete(id);
    }

    @Override
    public void editPerson(PersonsEntity p) {
        System.out.println("Edit the person with last name: " + p.getLastname());
		m_personDAO.edit(p);
    }

	@Override
	public PersonsEntity getPersonById(Long id) {
		return m_personDAO.getPersonById(id);
	}
}
