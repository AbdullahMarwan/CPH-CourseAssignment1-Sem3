package facades;

import dtos.PersonDTO;
import entities.Person;
import utils.EMF_Creator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;


/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class PersonFacade implements IPersonFacade {

    private static PersonFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private PersonFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static PersonFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public PersonDTO create(PersonDTO person){
        PersonDTO p = new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getEmail(), person.getAge());
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(p);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
        return p;
    }

    @Override
    public PersonDTO getById(int id) {
        EntityManager em = emf.createEntityManager();
        Person p = em.find(Person.class, id);
        em.close();
        if (p != null) {
            return new PersonDTO(p);
        } else {
            return null;
        }
    }


    @Override
    public List<Person> getAllPersons() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> persons = query.getResultList();

        return persons;
    }
    @Override
    public PersonDTO updatePerson(int id, PersonDTO person) {
        EntityManager entityManager = emf.createEntityManager();
        PersonDTO existingPerson = entityManager.find(PersonDTO.class, id);
        if (existingPerson == null) {
            entityManager.close();
            return null;
        }
        entityManager.getTransaction().begin();
        existingPerson.setEmail(person.getEmail());
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setAge(person.getAge());
        entityManager.getTransaction().commit();
        entityManager.close();
        return existingPerson;
    }
    @Override
    public void deletePerson(int id) {
        EntityManager entityManager = emf.createEntityManager();
        PersonDTO person = entityManager.find(PersonDTO.class, id);
        if (person != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(person);
            entityManager.getTransaction().commit();
        }
        entityManager.close();
    }


    







    @Override
    public PersonDTO editPerson(PersonDTO person) {
        return null;
    }
}
