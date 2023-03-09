package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "hobby", schema = "ca1")
public class Hobby {
    @Id
    @Size(max = 45)
    @Column(name = "name", nullable = false, length = 45)
    private String id;

    @Size(max = 90)
    @NotNull
    @Column(name = "wikilink", nullable = false, length = 90)
    private String wikilink;

    @Size(max = 45)
    @NotNull
    @Column(name = "category", nullable = false, length = 45)
    private String category;

    @Size(max = 45)
    @NotNull
    @Column(name = "type", nullable = false, length = 45)
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWikilink() {
        return wikilink;
    }

    public void setWikilink(String wikilink) {
        this.wikilink = wikilink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}