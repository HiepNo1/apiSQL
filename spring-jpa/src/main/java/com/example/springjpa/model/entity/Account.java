package com.example.springjpa.model.entity;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Long profileId;
    private String name;
}
