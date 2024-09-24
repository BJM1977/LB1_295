package ch.csbe.productmanager.resources.products;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(255)")
    private String categoryName;

    @Column(columnDefinition = "varchar(255)")
    private String categoryDescription;

    @OneToMany()
    private List<Product>product;

    public Long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
