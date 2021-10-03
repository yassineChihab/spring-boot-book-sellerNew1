package com.chihab.springbootbooksellerNew1.security.jwt;

import com.chihab.springbootbooksellerNew1.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    Boolean validateToken(HttpServletRequest request);
}
