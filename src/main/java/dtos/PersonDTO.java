package dtos;

import entities.Address;
import entities.Person;
import entities.Phone;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A DTO for the {@link Person} entity
 */
public class PersonDTO {
    private int id;
    @Size(max = 45)
    private final String email;
    @Size(max = 45)
    private final String firstname;
    @Size(max = 45)
    private final String lastname;
    private final int age;

//    private Phone phone = new Phone();
//
//    private Address address = new Address();

    public PersonDTO(int id, String email, String firstname, String lastname, int age) throws InstantiationException, IllegalAccessException {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public static List<PersonDTO> toList(List<Person> ps) {
        List<PersonDTO> pDTOs = new ArrayList();
        ps.forEach(person -> pDTOs.add(new PersonDTO(person)));
        return pDTOs;
    }

    public PersonDTO(Person person) {
        if (person.getId() != 0)
            this.id = person.getId();
        this.email = person.getEmail();
        this.firstname = person.getFirstname();
        this.lastname = person.getLastname();
        this.age = person.getAge();
//        this.phone = person.getPhone();
//        this.address = person.getAddress();
    }


//    public Person getEntity() {
//        Person p = new Person(this.email, this.firstname, this.lastname, this.age);
//        if (id != 0)
//            p.setId(this.id);
//        this.phone.setPerson(p);
//        this.address.setPerson(p);
//        return p;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstname;
    }
    public String setFirstName(String firstname) {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }
    public String setLastName(String lastname) {
        return lastname;
    }

    public int getAge() {
        return age;
    }
    public int setAge(int age) {
        return age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PersonDTO entity = (PersonDTO) o;
//        return Objects.equals(this.id, entity.id) &&
//                Objects.equals(this.email, entity.email) &&
//                Objects.equals(this.firstname, entity.firstname) &&
//                Objects.equals(this.lastname, entity.lastname) &&
//                Objects.equals(this.age, entity.age);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, email, firstname, lastname, age);
//    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "email = " + email + ", " +
                "firstname = " + firstname + ", " +
                "lastname = " + lastname + ", " +
                "age = " + age + ")";
    }
}