package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

}