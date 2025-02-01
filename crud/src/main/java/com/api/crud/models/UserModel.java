package com.api.crud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import javax.persistence.*;


@Entity
@Table(name = "users") // This tells Hibernate to make a table out of this class

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firsName;

    @Column
    private String lastName;

    @Column
    private String email;

    public Long getId() {  // Long o int revisar
        return id;
    }

    public void setId(Long id) {  // Long o int revisar 
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }   

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
