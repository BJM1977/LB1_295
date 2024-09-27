package ch.csbe.productmanager.resources.users.login;

import ch.csbe.productmanager.resources.users.UserService;
import ch.csbe.productmanager.resources.users.dto.UserShowDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Tag(name ="LoginController",description ="Controller for Login Parameters")
@RequestMapping("users/login")
//http://localhost:8080/users/login

public class LoginController {
    @Autowired
    private LoginService loginServiceervice;



    @GetMapping()
    public List<UserShowDto> getUserEmailAdress() {
        return loginServiceervice.findAll();
    }
}
