package com.springboot.microservicemysqldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservicemysqldemo.model.Product;
import com.springboot.microservicemysqldemo.model.Response;
import com.springboot.microservicemysqldemo.respository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping(path="/add")
	public ResponseEntity<Response> addProduct(@RequestParam String name, @RequestParam String brandName, @RequestParam Integer price){
		
		Product product = new Product(null, name, brandName, price);
		System.out.println("Product details Captured: " + product );
		
		try {
		productRepository.save(product);
		Response response = new Response(101, "Product " + name + " saved successfully");
		return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception e) {
			Response response = new Response(701, "Product " + name + " not saved successfully. Exception " + e.getMessage());
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
