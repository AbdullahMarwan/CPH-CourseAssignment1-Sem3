package dtos;

import entities.Hobby;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Hobby} entity
 */
public class HobbyDTO implements Serializable {
    @Size(max = 45)
    private final String id;
    @Size(max = 90)
    @NotNull
    private final String wikilink;
    @Size(max = 45)
    @NotNull
    private final String category;
    @Size(max = 45)
    @NotNull
    private final String type;

    public HobbyDTO(String id, String wikilink, String category, String type) {
        this.id = id;
        this.wikilink = wikilink;
        this.category = category;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getWikilink() {
        return wikilink;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HobbyDTO entity = (HobbyDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.wikilink, entity.wikilink) &&
                Objects.equals(this.category, entity.category) &&
                Objects.equals(this.type, entity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wikilink, category, type);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "wikilink = " + wikilink + ", " +
                "category = " + category + ", " +
                "type = " + type + ")";
    }
}