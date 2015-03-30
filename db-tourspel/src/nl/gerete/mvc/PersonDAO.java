package nl.gerete.mvc;

import java.util.List;

/**
 * Created by marc on 3/11/15.
 */
public interface PersonDAO {

    public void save(PersonsEntity p);

    public void edit(PersonsEntity p);

    public List<PersonsEntity> listPersons();

    public void delete(Long id);

    PersonsEntity getPersonById(Long id);
}
