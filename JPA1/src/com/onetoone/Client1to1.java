package com.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Client1to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction et = em.getTransaction();
		et.begin();
//		Order o = new Order(1001, "pen");
//	Customer c = new Customer(1, "aaa", o);
		OrderDetails o = new OrderDetails();
		o.setOrderId(11);
		o.setOrderItem("sss");
		Customer c= new Customer();
		c.setCustomerId(1000);
		c.setCustomerName("pppp");
		c.setOrderdt(o);
	em.persist(c);
	et.commit();
	}

	public Client1to1() {
		// TODO Auto-generated constructor stub
	}

}
