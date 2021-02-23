package com.jwt.Entity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.Entity.UserCredential;
import com.jwt.Entity.Repo.UserRepo;


@Service
public class UserCreDentialService {

	@Autowired
	public UserRepo userRepo;
	
	
	public void CreateUser(UserCredential userCredential) {
		userRepo.save(userCredential);
	}
	
	public UserCredential findByEmail(String EmailId) {
		return userRepo.findByEmailId(EmailId);
	}
	
	
	
}
