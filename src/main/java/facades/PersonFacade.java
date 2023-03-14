package facades;

import dtos.PersonDTO;
import entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class PersonFacade implements IPerson {

    private static PersonFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private PersonFacade() {
    }


    /**
     * @param _emf
     * @return an instance of this facade class.
     */
    public static PersonFacade getPersonFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public PersonDTO create(PersonDTO p) {
        Person person = new Person(p.getEmail(), p.getFirstName(), p.getLastName(), p.getAge());
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
//            p.getPhone().setPerson(p);
//            p.getAddress().setPerson(p);
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return p;
    }

    @Override
    public PersonDTO getById(int id) throws EntityNotFoundException, InstantiationException, IllegalAccessException {
        EntityManager em = getEntityManager();
        Person p = em.find(Person.class, id);
        if (p == null)
            throw new EntityNotFoundException("The Person entity with ID: " + id + " Was not found");
        return new PersonDTO(p);
    }

    @Override
    public List<PersonDTO> getAll() {
        EntityManager em = getEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> persons = query.getResultList();
        return PersonDTO.toList(persons);
    }

    @Override
    public PersonDTO update(PersonDTO p) {
        if (p.getId() == 0)
            throw new IllegalArgumentException("The Person entity with ID: " + p.getId() + " Was not found");
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return p;
    }

    @Override
    public PersonDTO delete(int id) throws InstantiationException, IllegalAccessException {
        EntityManager em = getEntityManager();
        Person p = em.find(Person.class, id);
        if (p == null)
            throw new IllegalArgumentException("The Person entity with ID: " + id + " Was not found");
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        return null;
    }
}
