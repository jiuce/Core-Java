import java.io.IOException;
import java.util.ArrayList;

import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;


public class TestXMLtoDatabaseImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadEmployee read = new ReadEmployee();		
		ArrayList<Employee> list = new ArrayList<Employee>();
		EmployeeXMLDaoImpl impl = new EmployeeXMLDaoImpl();
		
		read.displayElements();
		impl.getEmployeesfromXML(read.list);
	}

}
	