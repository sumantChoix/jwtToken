package com.jwt.Entity.controller;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
public class AuthRequest {

	private String userName;
    private String password;
}
