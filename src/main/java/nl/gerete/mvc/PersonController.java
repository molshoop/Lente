package nl.gerete.mvc;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/14/15.
 */
@Controller
public class PersonController {

	private PersonService m_personService;

	@Autowired
	@Qualifier(value = "personService")
	public void setPersonService(PersonService personService) {
		m_personService = personService;
	}

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new PersonsEntity());
		model.addAttribute("listPersons", m_personService.listPersons());
		return "person";
	}

    @RequestMapping(value = "/person/delete", method = RequestMethod.GET)
    public String deletePerson(@RequestParam("id") Long id ) {
        m_personService.deletePerson(id);
        return "person";
    }
}
