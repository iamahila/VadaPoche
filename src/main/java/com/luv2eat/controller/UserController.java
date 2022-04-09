package com.luv2eat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2eat.entity.User;
import com.luv2eat.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public List<User> getUsers(){
		List<User> users = service.getUsers();
		System.out.println(users);
		return users;
	}

}
