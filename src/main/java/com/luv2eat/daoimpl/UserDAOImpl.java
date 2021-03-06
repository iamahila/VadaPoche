package com.luv2eat.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2eat.dao.UserDAO;
import com.luv2eat.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<User> getUsers() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<User> query = session.createQuery("from User", User.class);
		
		List<User> users = query.getResultList();
		
		return users;
	}

	@Override
	public User getUser(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		User user = session.get(User.class, id);
		
		return user;
	}

	@Override
	public void saveUser(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);		
	}
	
	@Override
	public void deleteUser(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(user);
	}

	
	
}
