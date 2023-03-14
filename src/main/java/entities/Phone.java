package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "phone", schema = "ca1")
public class Phone {
    @Id
    @Column(name = "personid", nullable = false)
    private Integer id;

    @Size(max = 8)
    @NotNull
    @Column(name = "number", nullable = false, length = 8)
    private String number;

    @Size(max = 45)
    @NotNull
    @Column(name = "description", nullable = false, length = 45)
    private String description;

    @OneToOne
    @JoinColumn(name = "personid", referencedColumnName = "id")
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPerson(Person p) {
    }
}