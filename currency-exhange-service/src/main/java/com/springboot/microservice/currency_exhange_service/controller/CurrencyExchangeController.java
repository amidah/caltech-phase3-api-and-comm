package com.springboot.microservice.currency_exhange_service.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.currency_exhange_service.model.ExchangeValue;
import com.springboot.microservice.currency_exhange_service.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeValueRepository exhangeValueRepository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue = exhangeValueRepository.findByFromAndTo(from, to);
		
		return exchangeValue;	
	}
}
