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

import com.luv2eat.entity.Menu;
import com.luv2eat.entity.Restaurant;
import com.luv2eat.entity.User;
import com.luv2eat.service.MenuService;
import com.luv2eat.service.RestService;
import com.luv2eat.service.UserService;

@RestController
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@GetMapping("/menus")
	public List<Menu> getFoods(){
		List<Menu> foods = service.getFoods();
		return foods;
	}
	
	@GetMapping("/menus/{menuid}")
	public Menu getFood(@PathVariable int menuid){
		Menu menu = service.getFood(menuid);		
		return menu;
	}
	
	@PostMapping("/menu")
	public void saveFood(@RequestBody Menu menu) {
		service.saveFood(menu);
	}
	
	@PutMapping("/menu")
	public void updateFood(@RequestBody Menu menu) {
		service.saveFood(menu);
	}
	
	@DeleteMapping("/menu/{menuid}")
	public void deleteFood(@PathVariable int menuid) {
		Menu menu = service.getFood(menuid);
		service.deleteFood(menu);			
	}

}
