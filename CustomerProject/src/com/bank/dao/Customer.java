package com.bank.dao;

public class Customer {
	private int custId;
	private String custName;
	private String city;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private double balance;
	private int mobileNumber;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String city, double balance,
			int mobileNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.balance = balance;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", city=" + city + ", balance=" + balance + ", mobileNumber="
				+ mobileNumber + "]";
	}
	

}
