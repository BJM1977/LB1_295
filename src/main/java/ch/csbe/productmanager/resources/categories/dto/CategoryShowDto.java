package ch.csbe.productmanager.resources.categories.dto;

import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "DTO für die Listenansicht aller Kategorien (CategoryShowWebseite)")
public class CategoryShowDto {
    @NotNull
    @Schema(description = "Einzigartige Identifikationsnummer der Kategorie")
    public Long id;
    @Schema(description = "Ist die Kategorie aktiv?")
    public String active;
    @Schema(description = "Name der Kategorie")
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
