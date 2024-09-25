package ch.csbe.productmanager.resources.products;

import ch.csbe.productmanager.resources.products.dto.ProductMapper;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import ch.csbe.productmanager.resources.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ProductMapper productMapper;


    public List<ProductShowDto> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductShowDto> productShowDtos = new ArrayList<>();
        for (Product product : products) {
            ProductShowDto mappedProduct = productMapper.toShowDto(product);
            productShowDtos.add(mappedProduct);
        }
        return productShowDtos;

    }

}
