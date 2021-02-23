package com.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JwtSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurityApplication.class, args);
		System.out.print("Applicaton started");
	}

}
