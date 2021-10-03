package com.chihab.springbootbooksellerNew1.service;

import com.chihab.springbootbooksellerNew1.model.User;
import com.chihab.springbootbooksellerNew1.security.UserPrincipal;
import com.chihab.springbootbooksellerNew1.security.jwt.IJwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public class AuthenticationService implements IAutehticationService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IJwtProvider jwtProvider;

    @Override
    public User SignInAndReturnJWT(User signInRequest)
    {
        Authentication authentication=authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getCreateTime(),signInRequest.getPassword())
        );
        UserPrincipal userPrincipal=(UserPrincipal) authentication.getPrincipal();
        String Jwt=jwtProvider.generateToken(userPrincipal);
        User signInUser=userPrincipal.getUser();
        signInUser.setToken(Jwt);
        return signInUser;
    }
}
