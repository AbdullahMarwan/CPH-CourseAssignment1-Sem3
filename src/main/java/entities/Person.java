package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person", schema = "ca1")
public class Person {
    @Id
    @Column(name = "personid", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

    @Size(max = 45)
    @Column(name = "firstname", length = 45)
    private String firstname;

    @Size(max = 45)
    @Column(name = "lastname", length = 45)
    private String lastname;

    @Column(name = "age")
    private Integer age;

    public Person(Integer id, String email, String firstname, String lastname, Integer age) {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}