package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cust1to1")
public class Customer {
@Id
	int customerId;
	String customerName;
	@OneToOne(cascade=CascadeType.ALL) //one to one unidirectional mapping
	OrderDetails orderdt;
	public OrderDetails getOrderdt() {
		return orderdt;
	}
	public void setOrderdt(OrderDetails orderdt) {
		this.orderdt = orderdt;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Customer(int customerId, String customerName, OrderDetails orderdt) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.orderdt = orderdt;
	}
	
	
	
}
