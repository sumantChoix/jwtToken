package com.jwt.securityConfig.UserDetailService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.Entity.UserCredential;
import com.jwt.Entity.Repo.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService 
{
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
        UserCredential user = repo.findByEmailId(emailId);
        System.out.print(user);
        return new org.springframework.security.core.userdetails.User(user.getEmailId(),user.getPassword(), new ArrayList<>(  ));
    }
}
