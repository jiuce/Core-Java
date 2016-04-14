package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClientWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("manager1");
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		
		Projects p1 = new Projects();
		p1.setProjectId(100);
		p1.setProjDesc("project1");
		Projects p2  =new Projects();
		p2.setProjectId(101);
		p2.setProjDesc("project2");
		
		Worker w1 = new Worker();
		w1.setWorkerId(1);
		w1.setWorkerName("aaaa");
		w1.getProjects().add(p1);
		w1.getProjects().add(p2);
		
		Worker w2= new Worker();
		w2.setWorkerId(2);
		w2.setWorkerName("bbbbbb");
		w2.getProjects().add(p1);
		em.persist(p1);
		em.persist(p2);
		em.persist(w1);
		em.persist(w2);
		et.commit();
	}

}
