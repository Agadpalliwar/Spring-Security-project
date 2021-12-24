package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApplicationUser;
import com.example.demo.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	        ApplicationUser user = userRepository.findByUsername(username);
	        return new User(user.getUsername(),user.getPassword(),new ArrayList<>());
	    }

}
