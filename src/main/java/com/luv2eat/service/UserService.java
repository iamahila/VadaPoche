package com.luv2eat.service;

import java.util.List;

import com.luv2eat.entity.User;

public interface UserService {

	public List<User> getUsers();
	public User getUser(int id);
	public void saveUser(User user);
	public void deleteUser(User user);
	
}
