package com.spring.estore.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	String name;
	String email;

	@Autowired
	Order order; // 1 to 1 relationship

	public User() {
		System.out.println("[User] - Object Created.");
	}

//	@Autowired
	public User(Order order) {
		System.out.println(
				"[User] - CONSTRUCTOR INJECTION - Object created with Parameterized Constructor with Order as an input.");
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrder() {
		return order;
	}

	
	public void setOrder(Order order) {
		System.out.println("[User] - SETTER INJECTION - setOrder executed having Order as an input.");
		this.order = order;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", order=" + order + "]";
	}

}
