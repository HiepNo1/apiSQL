package com.example.springjpa.service;

import com.example.springjpa.model.entity.User;
import com.example.springjpa.model.request.UserRequest;
import com.example.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        userRepository.save(user);
        return user;
    }

    @Override
    public User update(Long id, UserRequest userRequest) {
        User user = userRepository.getReferenceById(id);
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> delete(Long id) {
        userRepository.deleteById(id);
        return userRepository.findAll();
    }
}
