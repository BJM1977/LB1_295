package ch.csbe.productmanager.resources.products.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "DTO für die Listenansicht aller Produkte (ProduktShowWebseite)")
public class ProductShowDto {
    @NotNull
    @Schema(description = "Einzigartige Identifikationsnummer des Produkts")
    public Long id;
    @Schema(description = "Artikelnummer des Produkts")
    public String sku;
    @Schema(description = "Ist das Produkt im Verkauf?")
    public String active;
    @Schema(description = "Name des Produkts")
    public String name;
    @Schema(description = "Bild des Produkts")
    public String image;
    @Schema(description = "Beschreibung des Produkts")
    public String description;
    @Schema(description = "Preis des Produkts")
    public Float price;
    @Schema(description = "Lagerbestand des Produkts")
    public String stock;

    public Long getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public String getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public String getStock() {
        return stock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
