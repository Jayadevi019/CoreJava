import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs=new FileOutputStream("C:\\Deloitte\\My Programs\\src\\sample.txt");
		DataOutputStream ds=new DataOutputStream(fs);
		ds.writeBytes("Hello World");
		
		byte a[]={'H','a','i'};
	
		fs.write('H');
		fs.write('e');
		fs.write('l');
		fs.write('l');
		fs.write('o');
		fs.write(a);
		fs.close();
		System.out.println("File Created Sucessfully");
	}

}
