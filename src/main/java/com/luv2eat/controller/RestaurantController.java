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

import com.luv2eat.entity.Restaurant;
import com.luv2eat.entity.User;
import com.luv2eat.service.RestService;
import com.luv2eat.service.UserService;

@RestController
public class RestaurantController {
	
	@Autowired
	private RestService service;
	
	@GetMapping("/restaurants")
	public List<Restaurant> getRestaurants(){
		List<Restaurant> restaurants = service.getRestaurants();
		return restaurants;
	}
	
	@GetMapping("/restaurants/{restid}")
	public Restaurant getRestaurant(@PathVariable int restid){
		Restaurant restaurant = service.getRestaurant(restid);		
		return restaurant;
	}
	
	@PostMapping("/restaurant")
	public void saveRestaurant(@RequestBody Restaurant restaurant) {
		service.saveRestaurant(restaurant);
	}
	
	@PutMapping("/restaurant")
	public void updateRestaurant(@RequestBody Restaurant restaurant) {
		service.saveRestaurant(restaurant);
	}
	
	@DeleteMapping("/restaurant/{restid}")
	public void deleteRestaurant(@PathVariable int restid) {
		Restaurant restaurant = service.getRestaurant(restid);
		service.deleteRestaurant(restaurant);			
	}

}
