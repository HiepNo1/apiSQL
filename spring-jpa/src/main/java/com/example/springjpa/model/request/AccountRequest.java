package com.example.springjpa.model.request;

import lombok.Data;

@Data
public class AccountRequest {
    private String name;
    private String username;
    private String password;
    private Long profileId;
}
