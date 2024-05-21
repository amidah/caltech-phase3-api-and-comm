package com.springboot.microservicemysqldemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer pid;
	String name;
	String brandName;
	Integer price;
	
	public Product() {
		
	}

	public Product(Integer pid, String name, String brandName, Integer price) {
		super();
		this.pid = pid;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
	}
	
	
	
}
