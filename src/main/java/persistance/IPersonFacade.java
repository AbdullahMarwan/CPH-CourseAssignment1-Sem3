package persistance;

import dtos.PersonDTO;
import entities.Person;

import java.util.List;

public interface IPersonFacade {




    PersonDTO create(PersonDTO person);

     PersonDTO getById(int id);

     List<Person> getAllPersons();

     void deletePerson(int id);

     PersonDTO updatePerson(int id,PersonDTO p);


}
