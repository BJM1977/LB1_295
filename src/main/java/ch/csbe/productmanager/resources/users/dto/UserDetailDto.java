package ch.csbe.productmanager.resources.users.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO für die detailierte Listenansicht von Usern (UserDetailWebseiteDetailiert)")
public class UserDetailDto {
    private Long id;
    private String userName;
    private String userPassword;
    private String userEmailAdress;
    private boolean isAdmin=false;

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

    public boolean isAdmin() {
        return isAdmin;
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

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
