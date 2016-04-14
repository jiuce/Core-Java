package com.createxml.db;

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

public class CreateXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element element = doc.createElement("EMPS");
			element.appendChild(doc.createTextNode("Emps goes here"));
			doc.appendChild(element);
			
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer();
			//source: memory tree
			//dest: file
			
			DOMSource domSource = new DOMSource(doc);
			StreamResult result = new StreamResult("empstest.xml");
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

}
