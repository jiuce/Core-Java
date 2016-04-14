package com.di.hibTemplate;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class Customer {

	int custId;
	String custName;
		
	
	
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


	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

}
