package persistance;

import dtos.PersonDTO;
import entities.Person;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonMapper {
    public static Person getSpecificPerson(int personId) {
        Logger.getLogger("web").log(Level.INFO, "");

        PersistenceManager persistenceManager = new PersistenceManager("fog-unit");

        Person person = persistenceManager.getEntityManager().find(Person.class, personId);

        return person;
    }

    public static List<Person> getAllPeople() {

        PersistenceManager persistenceManager = new PersistenceManager("fog-unit");

        TypedQuery<Person> query = persistenceManager.getEntityManager().createNamedQuery("getAllPeople", Person.class);

        return query.getResultList();
    }
}
