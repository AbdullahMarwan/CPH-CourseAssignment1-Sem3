package dtos;

import entities.Address;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Address} entity
 */
public class AddressDto implements Serializable {
    @Size(max = 45)
    private final String id;
    @Size(max = 45)
    @NotNull
    private final String addinfo;

    public AddressDto(String id, String addinfo) {
        this.id = id;
        this.addinfo = addinfo;
    }

    public String getId() {
        return id;
    }

    public String getAddinfo() {
        return addinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto entity = (AddressDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.addinfo, entity.addinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addinfo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "addinfo = " + addinfo + ")";
    }
}