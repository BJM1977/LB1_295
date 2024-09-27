package ch.csbe.productmanager.resources.users;

import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import ch.csbe.productmanager.resources.products.dto.ProductUpdateDto;
import ch.csbe.productmanager.resources.users.dto.UserCreateDto;
import ch.csbe.productmanager.resources.users.dto.UserDetailDto;
import ch.csbe.productmanager.resources.users.dto.UserShowDto;
import ch.csbe.productmanager.resources.users.dto.UserUpdateDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name ="UserController",description ="Controller for User Parameters")
@RequestMapping("users")
//http://localhost:8080/users
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserShowDto> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    public UserDetailDto createUser(@RequestBody UserCreateDto userCreateDto) {
        return userService.create(userCreateDto);
    }
    @DeleteMapping("{id}")
    public void DeleteUser(@PathVariable Long id) {
        userService.delete(id);
    }
    @PutMapping("{id}")
    public UserDetailDto putUser(@RequestBody UserUpdateDto userUpdateDto, @PathVariable Long id) {
        return userService.update(id,userUpdateDto);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
