package com.example.springjpa.model.request;

import lombok.Data;

@Data
public class AccountLogin {
    private String username;
    private String password;
}
