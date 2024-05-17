package com.springboot.webmvcdemo.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webmvcdemo.model.News;

@RestController
public class NewsController {

	@GetMapping("/name")
	public String appName() {
		return "<h3>News Web App</h3>";
	}
	
	@GetMapping("/news")
	public LinkedHashMap<String, Object> getNews(){
		LinkedHashMap<String, Object> newsMap = new LinkedHashMap<String, Object>();
		
		News news1 = new News("John", "Article 1", "Article 1 Description");
		News news2 = new News("Johnie", "Article 2", "Article 1 Description");
		News news3 = new News("Roy", "Article 3", "Article 1 Description");
		News news4 = new News("Celina", "Article 4", "Article 1 Description");
		News news5 = new News("Melina", "Article 5", "Article 1 Description");
		News news6 = new News("Sam", "Article 6", "Article 1 Description");
		News news7 = new News("Robert", "Article 7", "Article 1 Description");
		
		ArrayList<News> newsList = new ArrayList<>();
		newsList.add(news1);
		newsList.add(news2);
		newsList.add(news3);
		newsList.add(news4);
		newsList.add(news5);
		newsList.add(news6);
		newsList.add(news7);
		
		newsMap.put("status", "OK");
		newsMap.put("total", newsList.size());
		newsMap.put("articles", newsList);
		
		
		return newsMap;
	}  
}
