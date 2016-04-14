
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtil {
	static Connection getConnectionToDb(String url,String userName,String password)
	{
		//write code to connect and return the connection
		Connection connection=null;
		//Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			//use drivermanager to get connection
		
		 connection=DriverManager.getConnection(url, userName, password);
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return connection;
		
		
		
		
	}
}
