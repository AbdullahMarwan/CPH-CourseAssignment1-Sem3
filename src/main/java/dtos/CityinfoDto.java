package dtos;

import entities.Cityinfo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Cityinfo} entity
 */
public class CityinfoDto implements Serializable {
    private final Integer id;
    @Size(max = 45)
    @NotNull
    private final String cityname;

    public CityinfoDto(Integer id, String cityname) {
        this.id = id;
        this.cityname = cityname;
    }

    public Integer getId() {
        return id;
    }

    public String getCityname() {
        return cityname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityinfoDto entity = (CityinfoDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.cityname, entity.cityname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cityname);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "cityname = " + cityname + ")";
    }
}