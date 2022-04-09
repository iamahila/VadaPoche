package com.luv2eat.dao;

import java.util.List;

import com.luv2eat.entity.User;

public interface UserDAO {

	public List<User> getUsers();
	public User getUser(int id);
	public void saveUser(User user);
	public void deleteUser(User user);
}
