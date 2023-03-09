package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "socialhub", schema = "ca1", indexes = {
        @Index(name = "fk_socialhub_cityinfo1_idx", columnList = "zipcode"),
        @Index(name = "fk_socialhub_hobby1_idx", columnList = "hobbylink"),
        @Index(name = "fk_socialhub_person2_idx", columnList = "personage"),
        @Index(name = "fk_socialhub_person1_idx", columnList = "personname")
})
public class Socialhub {
    @Id
    @Size(max = 45)
    @Column(name = "hobbyname", nullable = false, length = 45)
    private String id;

    @Size(max = 90)
    @NotNull
    @Column(name = "hobbylink", nullable = false, length = 90)
    private String hobbylink;

    @Size(max = 45)
    @NotNull
    @Column(name = "personname", nullable = false, length = 45)
    private String personname;

    @NotNull
    @Column(name = "personage", nullable = false)
    private Integer personage;

    @NotNull
    @Column(name = "experience", nullable = false)
    private Integer experience;

    @NotNull
    @Column(name = "zipcode", nullable = false)
    private Integer zipcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHobbylink() {
        return hobbylink;
    }

    public void setHobbylink(String hobbylink) {
        this.hobbylink = hobbylink;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public Integer getPersonage() {
        return personage;
    }

    public void setPersonage(Integer personage) {
        this.personage = personage;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

}