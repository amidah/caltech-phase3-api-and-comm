package com.spring.estore.bean;

public class Pizza extends FoodItem{
	int size;
	String toppings;
	
	public Pizza() {
		System.out.println("[Pizza] - Object Created. " + hashCode());
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + toppings + ", name=" + name + ", price=" + price + "]";
	}
	
}
