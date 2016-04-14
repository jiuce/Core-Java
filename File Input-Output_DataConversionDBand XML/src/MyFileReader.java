import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MyFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("testFile");
		try {
			FileInputStream fis = new FileInputStream(file);
			int numofbytes = fis.available();
			
			byte[] data= new byte[numofbytes];
			fis.read(data);
			System.out.println(new String(data).trim());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
