package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ApplicationUser;

public interface UserRepository  extends JpaRepository<ApplicationUser,Integer>{
	ApplicationUser findByUsername(String username);
}
