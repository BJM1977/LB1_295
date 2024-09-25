package ch.csbe.productmanager.resources.categories;

import ch.csbe.productmanager.resources.products.Product;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TinyInt")
    private String active;

    @Column(columnDefinition = "varchar(255)")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product>products;

    public Long getId() {
        return id;
    }

    public String getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
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

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
