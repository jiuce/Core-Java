package com.di.hibTemplate;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibTemplateTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		CustomerDaoHibernateTemplate c = (CustomerDaoHibernateTemplate) ctx.getBean("customer");
		ArrayList<Customer> lst  = new ArrayList<Customer>();
		lst=(ArrayList<Customer>) c.getAllcustomer();
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).getCustName());
		}

	}

}
