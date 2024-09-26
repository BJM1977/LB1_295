package ch.csbe.productmanager.resources.categories.dto;

import lombok.Data;

@Data
public class CategoryShowDto {
    public Long id;
    public String active;
    public String name;

    public Long getId() {
        return id;
    }

    public String getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }
}
