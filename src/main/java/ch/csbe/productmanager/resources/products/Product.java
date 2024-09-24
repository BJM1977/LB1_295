package ch.csbe.productmanager.resources.products;

import jakarta.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(255)")
    private String productName;

    @Column(columnDefinition = "varchar(255)")
    private String productDescription;

    @Column(columnDefinition = "double(4.2)")
    private Double productPrice;

    @ManyToOne()
    private Category category;

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
