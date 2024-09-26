package ch.csbe.productmanager.resources.users;
import ch.csbe.productmanager.resources.products.Product;
import ch.csbe.productmanager.resources.products.dto.*;
import ch.csbe.productmanager.resources.users.User;
import ch.csbe.productmanager.resources.users.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserMapper userMapper;


    public UserDetailDto getById(long id) {
        User user = this.userRepository.findById(id).orElseThrow(()->new
                ResourceNotFoundException("User with the id"+id+"could not be found!"));
        return  userMapper.toDetailDto(user);
    }

    public List<UserShowDto> findAll() {
        List<User> users = userRepository.findAll();
        List<UserShowDto> userShowDtos = new ArrayList<>();
        for (User user : users) {
            UserShowDto mappedUser = userMapper.toShowDto(user);
            userShowDtos.add(mappedUser);
        }
        return userShowDtos;

    }

    public UserDetailDto create(UserCreateDto userCreateDto) {
        User user = userMapper.toEntity(userCreateDto);
        User savedUser = userRepository.save(user);
        return userMapper.toDetailDto(savedUser);
    }
    public UserDetailDto update(Long id, UserUpdateDto userToupdate){
        User userEntinityToUpdate =userRepository.findById(id).orElseThrow(()->new
                ResourceNotFoundException("User with the id"+id+"could not be found!"));
        userMapper.update(userToupdate,userEntinityToUpdate);
        return userMapper.toDetailDto(userEntinityToUpdate);
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
