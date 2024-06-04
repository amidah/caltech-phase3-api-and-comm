package com.springboot.microservices.currency_conversion_service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.microservices.currency_conversion_service.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		// Lets initiate a rest request to currency exchange service using RestTemplate
		
		Map<String, String> uriVaribales = new HashMap<>();
		uriVaribales.put("from", from);
		uriVaribales.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate()
		.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVaribales);
		
		CurrencyConversionBean response = responseEntity.getBody();
		
		return new CurrencyConversionBean(response.getId(), response.getFrom(), 
				response.getTo(), response.getConversionMultiple(), 
				quantity, quantity.multiply(response.getConversionMultiple()));
	}
}
