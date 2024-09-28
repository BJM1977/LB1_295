package ch.csbe.productmanager.resources.users;

import ch.csbe.productmanager.resources.products.dto.ProductCreateDto;
import ch.csbe.productmanager.resources.products.dto.ProductDetailDto;
import ch.csbe.productmanager.resources.products.dto.ProductShowDto;
import ch.csbe.productmanager.resources.products.dto.ProductUpdateDto;
import ch.csbe.productmanager.resources.users.dto.*;
import ch.csbe.productmanager.resources.users.login.TokenService;
import ch.csbe.productmanager.resources.users.login.TokenWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ch.csbe.productmanager.resources.users.UserService;

import java.util.List;

@RestController
@Tag(name = "UserController", description = "Controller for User Parameters")
@RequestMapping("users")
//http://localhost:8080/users
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    @PostMapping("login")
    public TokenWrapper login(@RequestBody LoginRequestDto loginRequestDto) {
        User user = this.userService.getUserWithCredentials(loginRequestDto);
        if (user != null) {
            TokenWrapper tokenWrapper = new TokenWrapper();
            String token = this.tokenService.generateToken(user);
            tokenWrapper.setToken(token);
            return tokenWrapper;
        } else {
            //Errorhandling
            //Either return 401 or 400
            return null;
        }
    }

    @GetMapping
    public List<UserShowDto> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserCreateDto userCreateDto) throws BadRequestException {
        User createdUser = userService.registerNewUserAccount(userCreateDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public void DeleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

    @PutMapping("{id}")
    public UserDetailDto putUser(@RequestBody UserUpdateDto userUpdateDto, @PathVariable Long id) {
        return userService.update(id, userUpdateDto);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
