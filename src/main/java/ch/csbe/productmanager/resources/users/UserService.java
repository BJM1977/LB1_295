package ch.csbe.productmanager.resources.users;
import ch.csbe.productmanager.resources.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    /*public User addUser(User user) {
        return userRepository.save(user);
    }*/
}
