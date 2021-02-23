package com.jwt.Entity.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.Entity.UserCredential;


public interface UserRepo extends JpaRepository<UserCredential, Integer>
{

	UserCredential findByEmailId(String emailId);

	

}
