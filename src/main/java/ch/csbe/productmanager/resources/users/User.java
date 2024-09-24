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
}
