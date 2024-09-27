package ch.csbe.productmanager.resources.users.login;

import ch.csbe.productmanager.resources.users.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
//Schritt 4.1
public class MyUserPrincipal implements UserDetails {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserEmailAdress(String userEmailAdress) {
        this.user.setUserEmailAdress(userEmailAdress);
    }



    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new
                ArrayList<GrantedAuthority>();
        for (String privilege : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }
}
