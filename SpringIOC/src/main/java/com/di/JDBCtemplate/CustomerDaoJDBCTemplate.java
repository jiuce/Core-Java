package com.di.JDBCtemplate;

import java.util.ArrayList;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoJDBCTemplate {
	
	BasicDataSource datasource;
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public CustomerDaoJDBCTemplate() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> showALLNames(){
		
		String sql="Select CustomerName from customer";
		ArrayList<String> l = new ArrayList<String>();
	     l=(ArrayList<String>) jdbcTemplate.queryForList(sql, String.class);
	     return l;
	}

}
