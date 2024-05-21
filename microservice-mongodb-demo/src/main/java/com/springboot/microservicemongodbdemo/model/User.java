package com.springboot.microservicemongodbdemo.model;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	String id;
	
	String name;
	String phone;
	String email;
	
	Address address; // HAS-A Relationship | 1 to 1

	public User() {
		
	}

	public User(String id, String name, String phone, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ "]";
	}
	
}
