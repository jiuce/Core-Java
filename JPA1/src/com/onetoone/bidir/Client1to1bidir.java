package com.onetoone.bidir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client1to1bidir {

	public Client1to1bidir() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	Address a = new Address("kolkata", 700031);
	Employee e = new Employee(1101, "amit kr", "jwellery", a);
	em.persist(e);
	et.commit();
	}
}
