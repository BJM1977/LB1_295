package ch.csbe.productmanager.resources.categories.dto;

public class CategoryUpdateDto {
    public String active;
    public String name;

    public String getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }
}
