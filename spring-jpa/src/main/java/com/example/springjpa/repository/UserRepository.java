package com.example.springjpa.repository;

import com.example.springjpa.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    // data layer

    @Override
    Optional<User> findById(Long id);
    List<User> findAll();

}
