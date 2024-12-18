package com.example.lms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    String name;
    String Email;
    String role;
    String password;
    @Id
    private Long ID;

    public User(String name, String Email, String role, String password) {
        this.name = name;
        this.Email = Email;
        this.role = role;
        this.password = password;
    }

    public User() {

    }


    public void setId(Long id) {
        this.ID = id;
    }

    public Long getId() {
        return ID;
    }
}