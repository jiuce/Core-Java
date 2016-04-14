package com.model;

public class Product {
   
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	int prodId;
	String prodName;
	double prodPrice;
	int stock;
	
	public Product(String prodName, int stock) {
		super();
		this.prodName = prodName;
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Product(String prodName, double prodPrice, int stock) {
		super();
		
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", prodPrice=" + prodPrice
				+ ", stock=" + stock + "]";
	}

}
