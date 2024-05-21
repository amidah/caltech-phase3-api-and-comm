package com.springboot.microservicemongodbdemo.model;

import java.util.List;

public class Response {

	Integer code;
	String message;
	List<User> users;
	
	public Response() {
		
	}

	public Response(Integer code, String message) {
		
		this.code = code;
		this.message = message;
		
	}
	
	public Response(Integer code, String message, List<User> users) {
	
		this.code = code;
		this.message = message;
		this.users = users;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", users=" + users + "]";
	}

}
