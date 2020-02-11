package com.example.springBoot1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot1.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {    
	
	@GetMapping
	public ResponseEntity<User> findAll() {  // method to access users 
		User u = new User(1L, "Maria", "maria@gmail", "9999999", "1234");
		return ResponseEntity.ok().body(u);
		
	}
}
