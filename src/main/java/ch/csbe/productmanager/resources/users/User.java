package ch.csbe.productmanager.resources.users;

import jakarta.persistence.*;
@Entity
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
