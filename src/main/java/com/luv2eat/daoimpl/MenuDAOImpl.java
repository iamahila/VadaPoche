package com.luv2eat.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2eat.dao.MenuDAO;
import com.luv2eat.dao.RestDAO;
import com.luv2eat.dao.UserDAO;
import com.luv2eat.entity.Menu;
import com.luv2eat.entity.Restaurant;
import com.luv2eat.entity.User;

@Repository
public class MenuDAOImpl implements MenuDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Menu> getFoods() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<Menu> query = session.createQuery("from Menu", Menu.class);
		
		List<Menu> foods = query.getResultList();
		
		return foods;
	}

	@Override
	public Menu getFood(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		Menu menu = session.get(Menu.class, id);
		
		return menu;
	}

	@Override
	public void saveFood(Menu menu) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(menu);		
	}
	
	@Override
	public void deleteFood(Menu menu) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(menu);
	}

	
	
}
