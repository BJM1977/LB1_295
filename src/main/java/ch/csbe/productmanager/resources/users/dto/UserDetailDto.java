package ch.csbe.productmanager.resources.users.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

@Schema(description = "DTO für die detailierte Listenansicht von Usern (UserDetailWebseiteDetailiert)")
public class UserDetailDto {
    @NotNull
    @Schema(description = "Einzigartige Identifikationsnummer des Users")
    private Long id;
    @Schema(description = "Name des Users")
    private String userName;
    @Schema(description = "Passwort des Users")
    private String userPassword;
    @Schema(description = "E-MailAdresse des Users")
    private String userEmailAdress;
    @Schema(description = "Ist der User ein Admin?")
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
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsAdmin() {
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

}
