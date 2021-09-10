package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailedService implements UserDetailsService {

	 @Autowired
	    private UserRepository Repo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		  User user = Repo.findByEmail(email);
	        if (user == null) {
	            throw new UsernameNotFoundException("User not found");
	        }
	        return new CustomUserDetails(user);
	    }
	

}