package ch.csbe.productmanager.resources.products;

import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
//http://localhost:8080/products
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductShowDto> getProducts() {
        return productService.findAll();

    }

    @PostMapping
    public ProductDetailDto createProduct(@RequestBody ProductCreateDto productCreateDto) {
        return productService.create(productCreateDto);
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
