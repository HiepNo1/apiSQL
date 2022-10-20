package com.example.springjpa.model.request;

import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
}
