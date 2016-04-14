package com.di.hibTemplate;


import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;


public class CustomerDaoHibernateTemplate {
	HibernateTemplate template;

	
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	//add customer
	public void addCustomer(Customer c){
		template.save(c);
	}
	
	//view all customer
	public List<Customer> getAllcustomer(){
		List<Customer> list = new ArrayList<Customer>();
		list =template.loadAll(Customer.class);
		return list;
	}
	
}