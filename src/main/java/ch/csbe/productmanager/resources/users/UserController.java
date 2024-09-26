package ch.csbe.productmanager.resources.users;

import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import ch.csbe.productmanager.resources.users.dto.UserCreateDto;
import ch.csbe.productmanager.resources.users.dto.UserDetailDto;
import ch.csbe.productmanager.resources.users.dto.UserShowDto;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public UserDetailDto createProduct(@RequestBody UserCreateDto userCreateDto) {
        return userService.create(userCreateDto);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
