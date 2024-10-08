package ch.csbe.productmanager.resources.users;
import ch.csbe.productmanager.resources.users.dto.*;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public User registerNewUserAccount(UserCreateDto accountDto) throws BadRequestException {
        if (emailExist(accountDto.getUserEmailAdress())) {
            throw new BadRequestException(
                    "There is an account with that email adress:" + accountDto.getUserEmailAdress());
        }
        User user = new User();
        user.setUserName(accountDto.getUserName());


        user.setUserPassword(passwordEncoder.encode(accountDto.getUserPassword()));

        user.setUserEmailAdress(accountDto.getUserEmailAdress());

        return userRepository.save(user);
    }

    private boolean emailExist(String userEmailAdress) {
        return false;

    }


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

    public User getUserWithCredentials(LoginRequestDto loginRequestDto) {
        // Extrahiere Benutzername und Passwort aus dem DTO
        String usernameOrEmail = loginRequestDto.getUserName();
        String password = loginRequestDto.getPassword();

        // Finde den Benutzer in der Datenbank anhand des Benutzernamens oder der E-Mail-Adresse
        User user = userRepository.findUserByEmail(usernameOrEmail);


        // Überprüfe, ob das Passwort korrekt ist (beachten Sie, dass Passwörter gehasht gespeichert werden sollten)
        if (passwordEncoder.matches(password, user.getUserPassword())) {
            return user; // Rückgabe des Benutzers, wenn die Anmeldeinformationen korrekt sind
        } else {
            throw new BadCredentialsException("Invalid password"); // Fehlermeldung bei falschem Passwort
        }
    }

    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
}
