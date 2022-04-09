package com.luv2eat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="restid")
	private int restid;
	
	@Column(name="restaurant_name")
	private String restaurantName;
	
	@Column(name="restaurant_address")
	private String restaurantAddress;
	
	@Column(name="restaurant_contact")
	private String restaurantContact;
	
	@Column(name="email")
	private String email;
	
	public Restaurant() {}
	



	public Restaurant(int restid, String restaurantName, String restaurantAddress, String restaurantContact,
			String email) {
		super();
		this.restid = restid;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantContact = restaurantContact;
		this.email = email;
	}



	public int getRestid() {
		return restid;
	}

	public void setRestid(int restid) {
		this.restid = restid;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public String getRestaurantContact() {
		return restaurantContact;
	}

	public void setRestaurantContact(String restaurantContact) {
		this.restaurantContact = restaurantContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", restaurantAddress=" + restaurantAddress
				+ ", restaurantContact=" + restaurantContact + ", email=" + email + "]";
	}
	
	
	
	
}
