package ch.csbe.productmanager.resources.users.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO für das Bearbeiten von Usern (UserUpdateWebseite)")
public class UserUpdateDto {
    @Schema(description = "Name des Users")
    private String userName;
    @Schema(description = "Passwort des Users")
    private String userPassword;
    @Schema(description = "E-MailAdresse des Users")
    private String userEmailAdress;
    @Schema(description = "Ist der User ein Admin?")
    private Boolean isAdmin=false;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmailAdress() {
        return userEmailAdress;
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

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }
}
