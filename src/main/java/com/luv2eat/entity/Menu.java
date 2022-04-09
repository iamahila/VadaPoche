package com.luv2eat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="foodid")
	private int foodid;
	
	@Column(name="food_name")
	private String foodName;
	
	@Column(name="isAvailable")
	private String isAvailable;
	
	@Column(name="isVeg")
	private String isVeg;
	
	public Menu() {}

	public Menu(int foodid, String foodName, String isAvailable, String isVeg) {
		this.foodid = foodid;
		this.foodName = foodName;
		this.isAvailable = isAvailable;
		this.isVeg = isVeg;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getIsVeg() {
		return isVeg;
	}

	public void setIsVeg(String isVeg) {
		this.isVeg = isVeg;
	}

	@Override
	public String toString() {
		return "Menu [foodName=" + foodName + ", isAvailable=" + isAvailable + ", isVeg=" + isVeg + "]";
	}
	
}
