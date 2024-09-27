package ch.csbe.productmanager.resources.users.login;

import lombok.Data;

@Data
public class TokenWrapper {
    public Object setToken(String token) {
        return this;
    }

}
