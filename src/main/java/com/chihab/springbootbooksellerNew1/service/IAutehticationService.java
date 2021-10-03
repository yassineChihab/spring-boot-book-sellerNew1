package com.chihab.springbootbooksellerNew1.service;

import com.chihab.springbootbooksellerNew1.model.User;

public interface IAutehticationService {
    User SignInAndReturnJWT(User signInRequest);
}
