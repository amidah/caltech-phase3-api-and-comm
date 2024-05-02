package com.spring.estore.bean;

public class Restaurant {
	String name;
	String phone;
	String operatingHours;
	float ratings;
	
	Address address; // HAS-A Relationship | 1 to 1
	
	public Restaurant() {
		System.out.println("[Restaurant] Object Created");
	}
	
	// here we are fulfilling the dependency address
	// Constructor Injection
	public Restaurant(Address addr) {
		System.out.println("[Resturant] - Object Constructed with Address Injected");
		this.address = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Address getAddress() {
		return address;
	}

	// Setter method here fulfills the dependency for address
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", ratings="
				+ ratings + ", address=" + address + "]";
	}

}
