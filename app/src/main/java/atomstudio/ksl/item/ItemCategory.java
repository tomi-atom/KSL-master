package atomstudio.ksl.item;

import java.util.Date;

public class ItemCategory {
    int idCategory;
    String name, permalink;
    Date created, updated;

    public ItemCategory(int idCategory, String name, String permalink, Date created, Date updated) {
        this.idCategory = idCategory;
        this.name = name;
        this.permalink = permalink;
        this.created = created;
        this.updated = updated;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
