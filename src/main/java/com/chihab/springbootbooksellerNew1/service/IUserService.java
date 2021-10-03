package com.chihab.springbootbooksellerNew1.service;

import com.chihab.springbootbooksellerNew1.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
