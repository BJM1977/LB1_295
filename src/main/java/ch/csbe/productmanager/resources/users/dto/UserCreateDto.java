package ch.csbe.productmanager.resources.users.dto;

public class UserCreateDto {
    private String userName;
    private String userPassword;
    private String userEmailAdress;
    private boolean isAdmin=false;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmailAdress() {
        return userEmailAdress;
    }

    public boolean isAdmin() {
        return isAdmin;
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

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
