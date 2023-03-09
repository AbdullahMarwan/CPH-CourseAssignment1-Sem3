package dtos;

import entities.Person;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Person} entity
 */
public class PersonDto implements Serializable {
    private final Integer Id;
    @Size(max = 45)
    private final String email;
    @Size(max = 45)
    private final String firstName;
    @Size(max = 45)
    private final String lastName;
    private final Integer age;

    public PersonDto(Integer id, String email, String firstName, String lastName, Integer age) {
        Id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto entity = (PersonDto) o;
        return Objects.equals(this.Id, entity.Id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.age, entity.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, email, firstName, lastName, age);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "Id = " + Id + ", " +
                "email = " + email + ", " +
                "firstName = " + firstName + ", " +
                "lastName = " + lastName + ", " +
                "age = " + age + ")";
    }
}