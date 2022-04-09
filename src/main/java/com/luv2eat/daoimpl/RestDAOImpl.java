package com.luv2eat.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2eat.dao.RestDAO;
import com.luv2eat.dao.UserDAO;
import com.luv2eat.entity.Restaurant;
import com.luv2eat.entity.User;

@Repository
public class RestDAOImpl implements RestDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Restaurant> getRestaurants() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<Restaurant> query = session.createQuery("from Restaurant", Restaurant.class);
		
		List<Restaurant> restaurants = query.getResultList();
		
		return restaurants;
	}

	@Override
	public Restaurant getRestaurant(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		Restaurant restaurant = session.get(Restaurant.class, id);
		
		return restaurant;
	}

	@Override
	public void saveRestaurant(Restaurant restaurant) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(restaurant);		
	}
	
	@Override
	public void deleteRestaurant(Restaurant restaurant) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(restaurant);
	}

	
	
}
