import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnectionUsingProperties {

	public void useProperties() {
		Properties props = new Properties();

		try {
			props.load(new FileInputStream("dbconfig.properties"));
			Connection con = DatabaseUtil.getConnectionToDb(
					props.getProperty("url"), props.getProperty("userName"),
					props.getProperty("password"));
			PreparedStatement psmt = con
					.prepareStatement("Select * from employeexml");
			ResultSet rs = psmt.executeQuery();
			rs.next();
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
			rs.close();
			psmt.close();
			con.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void createProperties(){
		File file = new File("constants.properties");
		Properties props = new Properties();
		props.put("aaaa", "676dnkn");
		props.put("dddd", "vhdvd");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			props.store(fos, "testing to create properties file");
			System.out.println("check out the file: created");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBconnectionUsingProperties d = new DBconnectionUsingProperties();
		d.createProperties();
	}

}
