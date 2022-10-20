package com.example.springjpa.repository;

import com.example.springjpa.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsernameAndPassword(String username, String password);
    Optional<Account> findAccountByUsername(String username);
    List<Account> findAll();

}
