package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	@RequestMapping(method=RequestMethod.GET, path = "/home") 
	public String homePage() {
		System.out.println("[HomeController] Serving the request at /home");
		return "home";
	}
}
