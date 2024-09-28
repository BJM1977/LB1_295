package ch.csbe.productmanager.resources.users.dto;

public class LoginRequestDto {
    private String userName;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }
}
