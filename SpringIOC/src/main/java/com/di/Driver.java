package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Dependent d = new Dependent();
d.useDependency();*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Dependent dependt= (Dependent) ctx.getBean("d1");
		
	}

}
