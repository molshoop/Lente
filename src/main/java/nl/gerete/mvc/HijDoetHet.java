package nl.gerete.mvc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by marc on 3/11/15.
 */
public class HijDoetHet {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        PersonsEntity person = new PersonsEntity();
        person.setFirstname("Pankaj"); person.setLastname("India");
        person.setPassword("hhhhhh");
        person.setEmail("marc@t1est.nl");

//        personDAO.save(person);

        System.out.println("Person::"+person);

        List<PersonsEntity> list = personDAO.list();

        for(PersonsEntity p : list){
            System.out.println("Person List::"+p.getFirstname()+ " "+ p.getLastname());
        }
        //close resources
        context.close();
    }}
