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
	@Transactional
	public List<PersonsEntity> listPersons() {
		return m_personDAO.listPersons();
	}
}
