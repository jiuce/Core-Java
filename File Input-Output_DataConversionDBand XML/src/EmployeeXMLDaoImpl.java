import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;




public class EmployeeXMLDaoImpl implements EmployeeXMLdao {
	Connection conn;
	public Connection retrieveConnection(){
		return XMLtoDatabaseUtil.getConnectiontoDB("jdbc:mysql://localhost:3306/test", "root", "admin");
		
	}

	public void getEmployeesfromXML(ArrayList<Employee> lst){
		
		Iterator<Employee> itr = lst.iterator();
		System.out.println("got the list");
		while(itr.hasNext()){
			System.out.println("iterating");
			Employee element = itr.next();
			System.out.println("calling insert");
			insert(element);
		}
				
	}
	
	
	
	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		
		PreparedStatement psmt;
		try {
			psmt = retrieveConnection().prepareStatement("Insert into employeeXML values(?,?,?)");
			System.out.println("Connected");
			psmt.setInt(1, emp.getEmpId());
			psmt.setString(2, emp.getName());
			psmt.setDouble(3, emp.getSalary());
			psmt.executeUpdate();
			System.out.println("updated");
			retrieveConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
