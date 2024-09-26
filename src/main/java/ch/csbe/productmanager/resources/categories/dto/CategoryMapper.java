package ch.csbe.productmanager.resources.categories.dto;

import ch.csbe.productmanager.resources.categories.Category;
import ch.csbe.productmanager.resources.products.Product;
import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductUpdateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        componentModel = "spring"
)
public abstract class CategoryMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "active", target = "active")
    @Mapping(source = "name", target = "name")
    public abstract CategoryShowDto toShowDto(Category category);

    public abstract Category toEntity(CategoryCreateDto categoryCreateDto);
    public abstract CategoryDetailDto toDetailDto(Category category);
    public abstract void update (CategoryUpdateDto categoryUpdateDto, @MappingTarget Category category);

}
