package com.chihab.springbootbooksellerNew1.security;

import com.chihab.springbootbooksellerNew1.model.User;
import com.chihab.springbootbooksellerNew1.service.IUserService;
import com.chihab.springbootbooksellerNew1.util.SecurityUtil;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomUsrDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userService.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException(username));
        Set<GrantedAuthority> authorities=Set.of(SecurityUtil.convertToAuthority(user.getRole().name()));
        return UserPrincipal.builder().user(user).id(user.getId())
                                                .username(username)
                                                .password(user.getPassword())
                                                .authorities(authorities)
                                                .build();

    }
}
