package com.spring.cloud.eureka.client.demo.controller;


import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.eureka.client.demo.model.Product;
import com.spring.cloud.eureka.client.demo.model.Response;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/products")
	public Response getProducts() {
		
		Product p1 = new Product("Apple Iphone", 70000);
		Product p2 = new Product("Samsung LED TV", 80000);
		Product p3 = new Product("Split Air Conditioner", 50000);
		Product p4 = new Product("Apple Watch", 40000);
		Product p5 = new Product("Apple MacBook", 150000);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		
		Response response = new Response(HttpStatus.OK.value(), "Products Fetched Successfully", productList);
		
		return response;
	}
}
