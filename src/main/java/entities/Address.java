package entities;

import dtos.AddressDTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "address", schema = "ca1")
public class Address {
    @Id
    @Size(max = 45)
    @Column(name = "street", nullable = false, length = 45)
    private String id;

    @Size(max = 45)
    @NotNull
    @Column(name = "addinfo", nullable = false, length = 45)
    private String addinfo;

//    @OneToOne
//    @JoinTable(
//            name = "person_address",
//            joinColumns = @JoinColumn(name = "address_street", referencedColumnName = "street"),
//            inverseJoinColumns = @JoinColumn(name = "person_personid", referencedColumnName = "personid")
//    )
//    private String address;

    public Address() {
    }

    public Address(String id, String addinfo) {
        this.id = id;
        this.addinfo = addinfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddinfo() {
        return addinfo;
    }

    public void setAddinfo(String addinfo) {
        this.addinfo = addinfo;
    }

    public void add(AddressDTO addressDTO) {
    }

    public void setPerson(Person p) {
    }
}