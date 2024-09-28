package ch.csbe.productmanager.resources.users;

import ch.csbe.productmanager.resources.users.dto.UserDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

@Query("Select u From User u Where u.userEmailAdress = :userEmailAdress")
User findUserByEmail(String userEmailAdress);
}
