import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class MyFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("testFile");
		System.out.println(file.exists());
		try {
			FileOutputStream fos = new FileOutputStream(file);
			String data="Hello Paramita, FileSystem";
			byte[] data2 = data.getBytes();
			fos.write(data2);
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
