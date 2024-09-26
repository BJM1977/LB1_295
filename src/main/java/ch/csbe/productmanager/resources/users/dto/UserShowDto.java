package ch.csbe.productmanager.resources.users.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Schema(description = "DTO für die Listenansicht aller User (UserShowWebseite)")
@Getter
@Setter
public class UserShowDto {
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
    private Boolean isAdmin=false;

    public void setId(@NotNull Long id) {
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

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public @NotNull Long getId() {
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
}
