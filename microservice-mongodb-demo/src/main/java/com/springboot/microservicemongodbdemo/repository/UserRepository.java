package com.springboot.microservicemongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservicemongodbdemo.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
