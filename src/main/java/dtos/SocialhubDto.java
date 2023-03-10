package dtos;

import entities.Socialhub;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Socialhub} entity
 */
public class SocialhubDto implements Serializable {
    @Size(max = 45)
    private final String id;
    @Size(max = 90)
    @NotNull
    private final String hobbylink;
    @Size(max = 45)
    @NotNull
    private final String personname;
    @NotNull
    private final Integer personage;
    @NotNull
    private final Integer experience;
    @NotNull
    private final Integer zipcode;

    public SocialhubDto(String id, String hobbylink, String personname, Integer personage, Integer experience, Integer zipcode) {
        this.id = id;
        this.hobbylink = hobbylink;
        this.personname = personname;
        this.personage = personage;
        this.experience = experience;
        this.zipcode = zipcode;
    }

    public String getId() {
        return id;
    }

    public String getHobbylink() {
        return hobbylink;
    }

    public String getPersonname() {
        return personname;
    }

    public Integer getPersonage() {
        return personage;
    }

    public Integer getExperience() {
        return experience;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialhubDto entity = (SocialhubDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.hobbylink, entity.hobbylink) &&
                Objects.equals(this.personname, entity.personname) &&
                Objects.equals(this.personage, entity.personage) &&
                Objects.equals(this.experience, entity.experience) &&
                Objects.equals(this.zipcode, entity.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hobbylink, personname, personage, experience, zipcode);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "hobbylink = " + hobbylink + ", " +
                "personname = " + personname + ", " +
                "personage = " + personage + ", " +
                "experience = " + experience + ", " +
                "zipcode = " + zipcode + ")";
    }
}