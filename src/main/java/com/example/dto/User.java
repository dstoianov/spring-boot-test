package com.example.dto;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Funker on 06.05.2016.
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;

    User() {

    }

    User(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
