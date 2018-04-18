package com.rubix.webservices.gadmin.oauth2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.rubix.webservices.gadmin.oauth2.service.RubixUserService;
import com.rubix.webservices.gadmin.user.service.model.UserModel;

@Component
public class CustomUserDetailsService implements UserDetailsService
{
    @Autowired
    private RubixUserService userService;
    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        UserModel user = userService.findByUserName(userName);
        if(user == null){
            throw new UsernameNotFoundException("UserName "+userName+" not found");
        }
        return new SecurityUser(user);
    }
}
