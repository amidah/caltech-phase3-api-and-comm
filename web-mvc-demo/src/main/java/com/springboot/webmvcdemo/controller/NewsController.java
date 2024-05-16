package com.springboot.webmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

	@GetMapping("/name")
	public String appName() {
		return "News Web App";
	}
}
