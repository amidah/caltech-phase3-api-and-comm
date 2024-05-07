package com.springaop.demoapp.bean;

public class Product {
	int id;
	String name;
	int price;
	String brand;
	int stock;
	boolean canBuy;

	public Product() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isCanBuy() {
		return canBuy;
	}

	public void setCanBuy(boolean canBuy) {
		this.canBuy = canBuy;
	}

	public void productPurchase(String deliveryLocation, String deliveryTime, String userMail) {
		System.out.println("[Product] - Validating Stocks...");
		if (canBuy) {
		
			//Transaction - Core Business Logic
			System.out.println("----------------------------------------");
			System.out.println("[Product] - Bank Transaction Started for name " + name + " with price " + price);
			System.out.println("[Product] - Thank you " + userMail + " for buying " + name + " of brand " + brand);
			System.out.println("-----------------------------------------");
			System.out.println();
		
		}
		else {
			System.out.println("[Product] - We are out of stock. Please come back later!");
		}
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ "]";
	}

}
