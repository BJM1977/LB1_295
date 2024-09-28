package ch.csbe.productmanager.resources.users;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(255)")
    private String userName;

    @Column(columnDefinition = "varchar(255)")
    private String userPassword;

    @Column(columnDefinition = "varchar(255)")
    private String userEmailAdress;

    @Column(columnDefinition = "boolean")
    private Boolean isAdmin=false;

    public List<String>getRoles(){
        List<String> hardcodedRoles = new ArrayList<>();
        hardcodedRoles.add("ROLE_ADMIN");
        return hardcodedRoles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserEmailAdress(String userEmailAdress) {
        this.userEmailAdress = userEmailAdress;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmailAdress() {
        return userEmailAdress;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

}
