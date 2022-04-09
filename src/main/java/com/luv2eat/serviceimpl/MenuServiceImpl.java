package com.luv2eat.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2eat.dao.MenuDAO;
import com.luv2eat.dao.RestDAO;
import com.luv2eat.dao.UserDAO;
import com.luv2eat.entity.Menu;
import com.luv2eat.entity.Restaurant;
import com.luv2eat.entity.User;
import com.luv2eat.service.MenuService;
import com.luv2eat.service.RestService;
import com.luv2eat.service.UserService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuDAO menuDAO;

	@Override
	@Transactional
	public List<Menu> getFoods() {
		return menuDAO.getFoods();
	}

	@Override
	@Transactional
	public Menu getFood(int id) {
		return menuDAO.getFood(id);
	}

	@Override
	@Transactional
	public void saveFood(Menu menu) {
		menuDAO.saveFood(menu);
		
	}

	@Override
	@Transactional
	public void deleteFood(Menu menu) {
		menuDAO.deleteFood(menu);
	}
	
	
}
