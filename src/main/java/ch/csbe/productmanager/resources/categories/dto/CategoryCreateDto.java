package ch.csbe.productmanager.resources.categories.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO für das Erstellen von Kategorien CategoryCreateWebseite)")
public class CategoryCreateDto {
    @Schema(description = "Ist die Kategorie aktiv?")
    public String active;
    @Schema(description = "Name der Kategorie")
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
