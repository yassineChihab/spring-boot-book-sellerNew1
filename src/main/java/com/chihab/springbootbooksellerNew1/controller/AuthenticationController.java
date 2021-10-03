package com.chihab.springbootbooksellerNew1.controller;

import com.chihab.springbootbooksellerNew1.model.User;
import com.chihab.springbootbooksellerNew1.service.IAutehticationService;
import com.chihab.springbootbooksellerNew1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authentication")
public class AuthenticationController {

    @Autowired
    private IAutehticationService autehticationService;

    @Autowired
    private IUserService userService;

    @PostMapping("sign-up")
    public ResponseEntity<User> signup(@RequestBody User user)
    {
            return null;
    }
}
