package ch.csbe.productmanager.resources.products.dto;

import ch.csbe.productmanager.resources.products.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public abstract class ProductMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    public abstract ProductShowDto toShowDto(Product product);
}
