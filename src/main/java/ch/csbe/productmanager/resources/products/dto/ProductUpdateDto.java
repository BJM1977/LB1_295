package ch.csbe.productmanager.resources.products.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO für das Bearbeiten von Produkten (ProduktsUpdateWebseite)")
public class ProductUpdateDto {
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
