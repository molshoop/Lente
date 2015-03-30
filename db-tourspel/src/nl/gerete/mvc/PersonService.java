package nl.gerete.mvc;

import java.util.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/14/15.
 */
public interface PersonService {
	public void savePerson(PersonsEntity p);

	public List<PersonsEntity> listPersons();

    public void deletePerson(Long id);
}
