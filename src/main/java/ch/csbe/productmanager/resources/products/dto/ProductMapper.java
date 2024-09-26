package ch.csbe.productmanager.resources.products.dto;

import ch.csbe.productmanager.resources.products.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        componentModel = "spring"
)
public abstract class ProductMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "sku", target = "sku")
    @Mapping(source = "active", target = "active")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "image", target = "image")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "stock", target = "stock")
    public abstract ProductShowDto toShowDto(Product product);

    public abstract Product toEntity(ProductCreateDto productCreateDto);
    public abstract ProductDetailDto toDetailDto(Product product);
    public abstract void update ( ProductUpdateDto productUpdateDto,@MappingTarget Product product);

}
