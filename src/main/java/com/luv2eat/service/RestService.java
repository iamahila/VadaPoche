package com.luv2eat.service;

import java.util.List;

import com.luv2eat.entity.Restaurant;


public interface RestService {

	public List<Restaurant> getRestaurants();
	public Restaurant getRestaurant(int id);
	public void saveRestaurant(Restaurant restaurant);
	public void deleteRestaurant(Restaurant restaurant);
	
}
