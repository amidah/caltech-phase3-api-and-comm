package com.springboot.microservice.currency_exhange_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.currency_exhange_service.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
