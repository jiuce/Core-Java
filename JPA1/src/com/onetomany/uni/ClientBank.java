package com.onetomany.uni;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClientBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		BankAccountHolders bh1 = new BankAccountHolders(130000001, "akash", "Savings");
		BankAccountHolders bh2 = new BankAccountHolders(130000002, "rita", "Savings");
		BankAccountHolders bh3 = new BankAccountHolders(130000003, "ram", "Checking");
		Set<BankAccountHolders> holders = new HashSet<BankAccountHolders>();
		
		holders.add(bh1);
		holders.add(bh2);
		holders.add(bh3);
		
		Bank b = new Bank();
		
		//this line populates foreign key bank_id column in bankaccountholders table.
		bh1.setBank(b);
		bh2.setBank(b);
		bh3.setBank(b);
		b.setBankId(2011);
		b.setBanklocation("kolkata");
		b.setBankName("BoA");
		b.setAcholder(holders);
		
		em.persist(b);
		et.commit();
		
	}

}
