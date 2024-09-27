package ch.csbe.productmanager.resources.users.login;

import ch.csbe.productmanager.resources.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface LoginRepository extends JpaRepository<User, Long> {
}
