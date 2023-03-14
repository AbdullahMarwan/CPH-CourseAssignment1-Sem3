package entities;

import dtos.AddressDTO;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "person", schema = "ca1")
@NamedQuery(name = "Person.deleteAllRows", query = "DELETE from Person")
public class Person {
    @Id
    @Column(name = "personid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Size(max = 45)
    @Column(name = "firstname", length = 45)
    private String firstname;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Size(max = 45)
    @Column(name = "lastname", length = 45)
    private String lastname;
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "age")
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @OneToOne(mappedBy = "person")
    private Phone phone;
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @OneToOne(mappedBy = "address")
    private Address address;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Person() {
    }

    public Person(String email, String firstname, String lastname, int age) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }















}