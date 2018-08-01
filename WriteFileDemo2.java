import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Deloitte\\My Programs\\src\\sample1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("First Line");
		bw.newLine();
		bw.write("Second Line");
		bw.newLine();
		bw.write("Third Line");
		bw.close();
		fw.close();
		System.out.println("File Created Sucessfully");
	}

}
