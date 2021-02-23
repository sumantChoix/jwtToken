package com.jwt.Entity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.Entity.UserCredential;
import com.jwt.Entity.Repo.UserRepo;
import com.jwt.Entity.service.UserCreDentialService;
import com.jwt.JwtFilter.JwtUtil;

@RestController
public class FrontController {

	@Autowired
	public UserCreDentialService userCreDentialService;
	
	
    	 @Autowired
	    private JwtUtil jwtUtil;
	    @Autowired
	    private AuthenticationManager authenticationManager;

	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
	
	
	@GetMapping("/signUp")
	public String UserCreated(@RequestBody UserCredential userCredential) {
		userCreDentialService.CreateUser(userCredential);
		System.out.print("in post mapping");
		return "user created sucessfully";
	}
	
	
	@GetMapping("/{EmailID}")
	public UserCredential findByEmailId (@PathVariable("EmailID") String EmailID) {
	 return	userCreDentialService.findByEmail(EmailID);
	}

	@GetMapping("/acess")
	public String home() {
		return "hello world";
	}
	@GetMapping("/home")
	public String home2() {
		return "hello from acess page world";
	}
	
	@GetMapping("/")
	public String home1() {
		return "hello from home1";
	}
	
}
