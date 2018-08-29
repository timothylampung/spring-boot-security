package com.springsecurity.server.security.service;


import com.springsecurity.server.security.model.ApplicationUser;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;




@Service
public class CustomUserDetailService implements UserDetailsService {



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("batman", "$2a$10$D2uyPIgJ4sAShyLoG1wl2O/tfjbNxB.eiGflXM2gOuznu0x04.Yxe"
                , AuthorityUtils.createAuthorityList("ROLE_USER"));
    }

    public ApplicationUser loadAplicationUserByUsername(String username){
        return new ApplicationUser("batman","$2a$10$D2uyPIgJ4sAShyLoG1wl2O/tfjbNxB.eiGflXM2gOuznu0x04.Yxe");
    }

    public ApplicationUser getCurrentUser(){
        return new ApplicationUser(SecurityContextHolder.getContext().getAuthentication().getName().toLowerCase(),"$2a$10$D2uyPIgJ4sAShyLoG1wl2O/tfjbNxB.eiGflXM2gOuznu0x04.Yxe");
    }
}
