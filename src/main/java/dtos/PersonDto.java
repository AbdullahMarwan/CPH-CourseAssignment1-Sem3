package dtos;

import entities.Person;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Person} entity
 */
public class PersonDto implements Serializable {
    private final Integer id;
    @Size(max = 45)
    private final String email;
    @Size(max = 45)
    private final String firstname;
    @Size(max = 45)
    private final String lastname;
    private final Integer age;

    public PersonDto(Integer id, String email, String firstname, String lastname, Integer age) {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
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
        PersonDto entity = (PersonDto) o;
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