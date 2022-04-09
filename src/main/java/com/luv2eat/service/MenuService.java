package com.luv2eat.service;

import java.util.List;

import com.luv2eat.entity.Menu;
import com.luv2eat.entity.Restaurant;


public interface MenuService {

	public List<Menu> getFoods();
	public Menu getFood(int id);
	public void saveFood(Menu menu);
	public void deleteFood(Menu menu);
	
}
