package com.luv2eat.dao;

import java.util.List;

import com.luv2eat.entity.Restaurant;


public interface RestDAO {

	public List<Restaurant> getRestaurants();
	public Restaurant getRestaurant(int id);
	public void saveRestaurant(Restaurant restaurant);
	public void deleteRestaurant(Restaurant restaurant);
}
