package entities;

import dtos.PersonDTO;
import jakarta.persistence.NamedQuery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@NamedQuery(name = "getAllPeople", query = "SELECT p FROM Person p")
@Table(name = "person", schema = "ca1")
public class Person {

    @Id
    @Column(name = "personId", nullable = false)
    private Integer Id;

    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

    @Size(max = 45)
    @Column(name = "firstName", length = 45)
    private String firstName;

    @Size(max = 45)
    @Column(name = "lastName", length = 45)
    private String lastName;

    @Column(name = "age")
    private Integer age;

    public Person(Integer Id, String email, String firstName, String lastName, Integer age) {
        this.Id = Id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {

    }

    public static List<PersonDTO> getDtos(List<Person> ps) {
        return null;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}