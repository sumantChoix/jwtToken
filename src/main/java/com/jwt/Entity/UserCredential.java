package com.jwt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class UserCredential {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String emailId;
	private String name;
	private String password;
	
	
	
	
	
	
	
	
	
	
}
