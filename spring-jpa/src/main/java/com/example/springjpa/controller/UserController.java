package com.example.springjpa.controller;

import com.example.springjpa.model.entity.User;
import com.example.springjpa.model.request.UserRequest;
import com.example.springjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/create")
    ResponseEntity<User> create(@RequestBody UserRequest request) {
        User user = userService.create(request);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getAll")
    public List<User> get() {
        return userService.getAll();
    }

    @GetMapping("/getId/{id}")
    public ResponseEntity<User> getById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> update(@PathVariable(name = "id") long id, @RequestBody UserRequest request) {
        return ResponseEntity.ok(userService.update(id, request));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<List<User>> delete(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(userService.delete(id));
    }
}
