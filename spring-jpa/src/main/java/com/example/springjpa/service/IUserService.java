package com.example.springjpa.service;

import com.example.springjpa.model.entity.User;
import com.example.springjpa.model.request.UserRequest;

import java.util.List;

public interface IUserService {

    User getUserById(Long id);

    List<User> getAll();
    User create(UserRequest userRequest);

    User update(Long id, UserRequest userRequest);

    List<User> delete(Long id);
}
