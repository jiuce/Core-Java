import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class MydataReader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("text2.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
		String s=dis.readUTF();
			System.out.println(s);
			
			int b = dis.readInt();
			System.out.println(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
