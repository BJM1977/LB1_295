package ch.csbe.productmanager.resources.users.dto;

import ch.csbe.productmanager.resources.products.Product;
import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import ch.csbe.productmanager.resources.products.dto.ProductUpdateDto;
import ch.csbe.productmanager.resources.users.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        componentModel = "spring"
)
public abstract class UserMapper {
   /* @Mapping(source = "id", target = "id")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "userPassword", target = "userPassword")
    @Mapping(source = "userEmailAdress", target = "userEmailAdress")
    @Mapping(source = "isAdmin", target = "isAdmin")
    @Mapping(source = "id", target = "id")*/
    public abstract UserShowDto toShowDto(User user);

    public abstract User toEntity(UserCreateDto userCreateDto);
    public abstract UserDetailDto toDetailDto(User user);
    public abstract void update (UserUpdateDto userUpdateDto, @MappingTarget User user);

}
