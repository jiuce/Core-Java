package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction et = em.getTransaction();
		et.begin();
		Product p = new Product();
		p.setProductId(10013);
		p.setProductName("adhkjl");
		p.setProductPrice(33.77);
		em.persist(p);
		et.commit();
	}

}
