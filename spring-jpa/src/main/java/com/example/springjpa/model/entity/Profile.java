package com.example.springjpa.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Table
@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String address;
    private String avatar;
    private Integer age;
    private LocalDate birthday;
}