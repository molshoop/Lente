package nl.gerete.mvc;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/14/15.
 */
@Controller
public class PersonController {

	private static final String PERSONS_PAGE = "persons";

	private PersonService m_personService;

	@Autowired
	@Qualifier(value = "personService")
	public void setPersonService(PersonService personService) {
		m_personService = personService;
	}

	@RequestMapping(value="/person", method=RequestMethod.GET)
	public String showNewPersonForm(@RequestParam("new") String age, Map<String, Object> model){
		model.put("person", new PersonsEntity());
		return "add_person";
	}

	@RequestMapping(value = "/person/add", method = RequestMethod.POST)
	public String addPersonFromForm(PersonsEntity personsEntity, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			return "add_person";
		}
		m_personService.savePerson(personsEntity);
		return "redirect:/" + PERSONS_PAGE;
	}

	@RequestMapping(value = PERSONS_PAGE, method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new PersonsEntity());
		model.addAttribute("listPersons", m_personService.listPersons());
		return "person";
	}

    @RequestMapping(value = "/person/delete", method = RequestMethod.GET)
    public String deletePerson(@RequestParam("id") Long id ) {
        m_personService.deletePerson(id);
		return "redirect:/" + PERSONS_PAGE;
	}
}
