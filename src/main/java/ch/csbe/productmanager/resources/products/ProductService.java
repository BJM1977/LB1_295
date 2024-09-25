package ch.csbe.productmanager.resources.products;

import ch.csbe.productmanager.resources.products.dto.*;
import ch.csbe.productmanager.resources.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ProductMapper productMapper;

    public ProductDetailDto getById(long id) {
        Product product = this.productRepository.findById(id).orElseThrow(()->new
                ResourceNotFoundException("Product with the id"+id+"could not be found!"));
        return  productMapper.toDetailDto(product);
    }

    public List<ProductShowDto> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductShowDto> productShowDtos = new ArrayList<>();
        for (Product product : products) {
            ProductShowDto mappedProduct = productMapper.toShowDto(product);
            productShowDtos.add(mappedProduct);
        }
        return productShowDtos;

    }

    public ProductDetailDto create(ProductCreateDto productCreateDto) {
        Product product = productMapper.toEntity(productCreateDto);
        Product savedProduct = productRepository.save(product);
        return productMapper.toDetailDto(savedProduct);
    }
    public ProductDetailDto update(Long id, ProductUpdateDto productToupdate){
        Product productEntinityToUpdate =productRepository.findById(id).orElseThrow(()->new
                ResourceNotFoundException("Product with the id"+id+"could not be found!"));
        productMapper.update(productToupdate,productEntinityToUpdate);
        return productMapper.toDetailDto(productEntinityToUpdate);
    }
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
