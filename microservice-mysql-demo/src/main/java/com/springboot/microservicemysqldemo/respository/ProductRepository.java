package com.springboot.microservicemysqldemo.respository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.microservicemysqldemo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
