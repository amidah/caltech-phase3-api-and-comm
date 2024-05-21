package com.springboot.microservicemongodbdemo.model;

public class Address {
	String addressLine;
	String city;
	String state;
	Integer zipCode;
	
	public Address() {}

	public Address(String addressLine, String city, String state, Integer zipCode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ "]";
	}
	
}
