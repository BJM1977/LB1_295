package ch.csbe.productmanager.resources.products;

import ch.csbe.productmanager.resources.categories.dto.CategoryDetailDto;
import ch.csbe.productmanager.resources.categories.dto.CategoryUpdateDto;
import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import ch.csbe.productmanager.resources.products.dto.ProductUpdateDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name ="ProductController",description ="Controller for Product Parameters")
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
    @DeleteMapping("{id}")
    public void DeleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }
    @PutMapping("{id}")
    public ProductDetailDto putCategory(@RequestBody ProductUpdateDto productUpdateDto, @PathVariable Long id) {
        return productService.update(id,productUpdateDto);
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
