package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cityinfo", schema = "ca1")
public class Cityinfo {
    @Id
    @Column(name = "zipcode", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "cityname", nullable = false, length = 45)
    private String cityname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

}