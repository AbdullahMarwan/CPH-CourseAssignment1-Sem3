package persistance;

import entities.Person;

import java.util.List;

public class PersonFacade {
    public static Person getSpecificPerson(int personId) {
        return PersonMapper.getSpecificPerson(personId);
    }

    public static List<Person> getAllPeople() {
        return PersonMapper.getAllPeople();
    }

}
