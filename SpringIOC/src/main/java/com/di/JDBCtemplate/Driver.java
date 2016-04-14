package com.di.JDBCtemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-jdbc.xml");
		CustomerDaoJDBCTemplate c = (CustomerDaoJDBCTemplate) ctx.getBean("customerdao");
       List<String> lst = new ArrayList<String>();
		lst=c.showALLNames();
		for(int i=0;i<lst.size();i++)
		System.out.println(lst.get(i));
		
	}

}
