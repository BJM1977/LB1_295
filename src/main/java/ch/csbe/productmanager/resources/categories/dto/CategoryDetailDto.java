package ch.csbe.productmanager.resources.categories.dto;

public class CategoryDetailDto {
    public String id;
    public String active;
    public String name;

    public String getId() {
        return id;
    }

    public String getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }
}
