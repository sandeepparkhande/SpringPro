package com.example;

public class Product {

	private String productName;
	private String quantity;
	private Double price;

	public Product() {
	}

	public Product(String productName, String quantity, Double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
