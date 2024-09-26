package ch.csbe.productmanager.resources.categories.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

@Schema(description = "DTO für die detailierte Listenansicht von Kategorien (CategoryDetailWebseiteDetailiert)")
public class CategoryDetailDto {
    @NotNull
    @Schema(description = "Einzigartige Identifikationsnummer der Kategorie")
    public String id;
    @Schema(description = "Ist die Kategorie aktiv?")
    public String active;
    @Schema(description = "Name der Kategorie")
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
