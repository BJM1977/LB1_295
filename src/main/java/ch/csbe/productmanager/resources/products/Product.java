package ch.csbe.productmanager.resources.products;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(100)")
    private String sku;

    @Column(columnDefinition = "TinyInt")
    private String active;

    @Column(columnDefinition = "varchar(500)")
    private String name;

    @Column(columnDefinition = "varchar(1000)")
    private String image;

    @Column(columnDefinition = "mediumtext")
    private String description;

    @Column(columnDefinition = "float")
    private Float price;

    @Column(columnDefinition = "INT")
    private String stock;

    @ManyToOne()
    private Category category;

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

    public Category getCategory() {
        return category;
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

    public void setCategory(Category category) {
        this.category = category;
    }
}
