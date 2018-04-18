package com.rubix.webservices.gadmin.oauth2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.rubix.webservices.gadmin.oauth2.service.RubixUserService;
import com.rubix.webservices.gadmin.user.service.model.UserModel;


@Component 
public class OAuthUserDetailService implements UserDetailsService {

	@Autowired
    private RubixUserService userService;
    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        UserModel user = userService.findByUserName(userName);
        if(user == null){
            throw new UsernameNotFoundException("UserName "+userName+" not found");
        }
        
        OAuthUser ouser =  new OAuthUser(user);
        User userdetails = new User(ouser.getUsername(), ouser.getPassword(), true, true, true, true, ouser.getAuthorities()); 
        
        return userdetails;
    }

	
}