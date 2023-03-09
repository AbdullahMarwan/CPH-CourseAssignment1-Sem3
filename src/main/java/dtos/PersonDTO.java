package dtos;

import entities.Person;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link Person} entity
 */
public class PersonDTO implements Serializable {
    private final Integer id;
    @Size(max = 45)
    private final String email;
    @Size(max = 45)
    private final String firstname;
    @Size(max = 45)
    private final String lastname;
    private final Integer age;

    public PersonDTO(Integer id, String email, String firstname, String lastname, Integer age) {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    private List<AddressDTO> addresses = new ArrayList<>();
    private List<PhoneDTO> phones = new ArrayList<>();

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.email = person.getEmail();
        this.firstname = person.getFirstname();
        this.lastname = person.getLastname();
        this.age = person.getAge();
        person.getAddress().forEach(address ->this.addresses.add(new AddressDTO(address)));
        person.getPhones().forEach(phone ->this.phones.add(new PhoneDTO(phone)));
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO entity = (PersonDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.firstname, entity.firstname) &&
                Objects.equals(this.lastname, entity.lastname) &&
                Objects.equals(this.age, entity.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstname, lastname, age);
    }

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