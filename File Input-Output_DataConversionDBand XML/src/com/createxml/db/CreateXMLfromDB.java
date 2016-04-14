package com.createxml.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class CreateXMLfromDB {

	public Employee[] getDataFromDb(){
		int i=0;
		Employee[] emp=null;
		
		Connection con = DatabaseUtil.getConnectionToDb("jdbc:mysql://localhost:3306/test","root", "admin");
		try {
			
			PreparedStatement psmt = con.prepareStatement("Select count(*) from employeexml");
			ResultSet rs = psmt.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			System.out.println(count);
			psmt = con.prepareStatement("Select * from employeexml");
			rs=psmt.executeQuery();
			emp = new Employee[count];
			while(rs.next()){
				 emp[i]=new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				 System.out.println(emp[i].getEmpId());
				 i++;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	return emp;
	
	}
	
	public void createXML(Employee[] emp){
				
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder =docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			
			for(int i=0; i<emp.length;i++){
				
				System.out.println(emp[i].getEmpId());
				Element element =doc.createElement("EMPLOYEE");
				element.appendChild(doc.createElement("EMPID"));
				System.out.println(emp[i].getEmpId());
				element.appendChild(doc.createTextNode(Integer.toString(emp[i].getEmpId())));
				doc.appendChild(element);
			}
				TransformerFactory tFactory = TransformerFactory.newInstance();
				Transformer transformer = tFactory.newTransformer();
				
				DOMSource domSource = new DOMSource(doc);
				StreamResult result = new StreamResult("empfromdb.xml");
				transformer.transform(domSource, result);
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateXMLfromDB c= new CreateXMLfromDB();
		c.createXML(c.getDataFromDb());
	}

}
