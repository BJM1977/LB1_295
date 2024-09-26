package ch.csbe.productmanager.resources.categories.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO für die detailierte Listenansicht von Kategorien (CategoryDetailWebseiteDetailiert)")
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
