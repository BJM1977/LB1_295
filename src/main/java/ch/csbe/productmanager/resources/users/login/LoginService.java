package ch.csbe.productmanager.resources.users.login;

import ch.csbe.productmanager.resources.users.User;
import ch.csbe.productmanager.resources.users.UserRepository;
import ch.csbe.productmanager.resources.users.dto.UserMapper;
import ch.csbe.productmanager.resources.users.dto.UserShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginReposritory;
    @Autowired
    UserMapper userMapper;

    public List<UserShowDto> findAll() {
        List<User> users = loginReposritory.findAll();
        List<UserShowDto> userShowDtos = new ArrayList<>();
        for (User user : users) {
            UserShowDto mappedUser = userMapper.toShowDto(user);
            userShowDtos.add(mappedUser);
        }
        return userShowDtos;

    }

}
