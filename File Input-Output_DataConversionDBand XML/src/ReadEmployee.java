import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;


public class ReadEmployee implements ContentHandler {

	Employee[] emp=new Employee[4];
	String field;
	int i=0;
	ArrayList<Employee> list = new ArrayList<Employee>();
	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		list.clear();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		
//		Iterator<Employee> itr = list.iterator();
//		while(itr.hasNext()){
//			Object element = itr.next();
//			System.out.println(element+ "\\n");
//		}

	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		// TODO Auto-generated method stub	
		if(localName=="employee"){
			
			emp[i]=new Employee();
		}
			field = localName;
	
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		if(localName=="employee"){
			
			list.add(emp[i]);
			i++;
		}
		
		field=null;
		
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
	
		String data= new String(ch, start, length).trim();
			
		if(field=="empId"){
			int j= Integer.parseInt(data);
		
			emp[i].setEmpId(j);
			
		}
		if(field=="empName"){
			emp[i].setName(data);
			
			
		}
		else if(field=="empSalary"){
			double d= Double.parseDouble(data);
			emp[i].setSalary(d);
			
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub

	}

	public ReadEmployee() {
		super();
		// TODO Auto-generated constructor stub
		try {
			SAXParser sp = new SAXParser();
			sp.setContentHandler(this);
			
			sp.parse("Employee.xml");
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
	public void displayElements(){
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.println(element+ "\\n");
		}
	}
}


