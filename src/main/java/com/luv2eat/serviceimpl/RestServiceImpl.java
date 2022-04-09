package com.luv2eat.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2eat.dao.RestDAO;
import com.luv2eat.dao.UserDAO;
import com.luv2eat.entity.Restaurant;
import com.luv2eat.entity.User;
import com.luv2eat.service.RestService;
import com.luv2eat.service.UserService;

@Service
public class RestServiceImpl implements RestService{

	@Autowired
	private RestDAO restDAO;

	@Override
	@Transactional
	public List<Restaurant> getRestaurants() {
		return restDAO.getRestaurants();
	}

	@Override
	@Transactional
	public Restaurant getRestaurant(int id) {
		return restDAO.getRestaurant(id);
	}

	@Override
	@Transactional
	public void saveRestaurant(Restaurant restaurant) {
		restDAO.saveRestaurant(restaurant);
		
	}

	@Override
	@Transactional
	public void deleteRestaurant(Restaurant restaurant) {
		restDAO.deleteRestaurant(restaurant);
	}
	
	
}
