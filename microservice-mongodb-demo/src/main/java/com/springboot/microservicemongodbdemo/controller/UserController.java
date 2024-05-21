package com.springboot.microservicemongodbdemo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservicemongodbdemo.model.Address;
import com.springboot.microservicemongodbdemo.model.Response;
import com.springboot.microservicemongodbdemo.model.User;
import com.springboot.microservicemongodbdemo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping(path="/add")
	public ResponseEntity<Response> addUser(@RequestParam String name, @RequestParam String phone,
			@RequestParam String email, @RequestParam String adrsLine, @RequestParam String city,
			@RequestParam String state, @RequestParam Integer zipCode) {

		try {
			Address address = new Address(adrsLine, city, state, zipCode);
			User user = new User(null, name, phone, email, address);

			userRepository.save(user);

			Response response = new Response(101, "User " + name + " Saved Successfully at " + new Date());

			return new ResponseEntity<Response>(response, HttpStatus.OK);
		} catch (Exception e) {

			Response response = new Response(500, "User " + name + " Not Saved Successfully at " + new Date());

			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
