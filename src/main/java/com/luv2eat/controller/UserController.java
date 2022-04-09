package com.luv2eat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luv2eat.entity.User;
import com.luv2eat.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		List<User> users = service.getUsers();
		System.out.println(users);
		return users;
	}
	
	@GetMapping("/users/{userid}")
	public User getUser(@PathVariable int userid){
		User users = service.getUser(userid);		
		return users;
	}
	
	@PostMapping("/user")
	public void saveUser(@RequestBody User user) {
		service.saveUser(user);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		service.saveUser(user);
	}
	
	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable int userid) {
		User user = service.getUser(userid);
		service.deleteUser(user);		
	}

}
