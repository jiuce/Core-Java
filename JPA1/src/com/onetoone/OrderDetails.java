package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustOrder")
public class OrderDetails {
	@Id
	int orderId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderItem() {
		return orderItem;
	}
	public OrderDetails(int orderId, String orderItem) {
		super();
		this.orderId = orderId;
		this.orderItem = orderItem;
	}
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	String orderItem;
}
