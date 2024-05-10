package com.spring.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	@RequestMapping(method=RequestMethod.GET, path = "/home") 
	public String homePage() {
		System.out.println("[HomeController] Serving the request at /home");
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/welcome")
	public String welcomePage(Model model) {
		System.out.println("[HomeController] Serving the request at welcome");
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateTimeStamp = formatter.format(date);
		
		model.addAttribute("welcomeDateTimeStamp", dateTimeStamp);
		
		return "welcome";
	}
}
