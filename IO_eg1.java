import java.io.*;

public class IO_eg1 {

	public static void main(String[] args) throws IOException {
//		 System.out.println("Please Enter a Character");
//		 int xx = System.in.read();
//		 System.out.println("You entered "+(char)xx);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the name: ");
		String myName = br.readLine();
		System.out.println("Age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Age is "+age);
		System.out.println("Welcome " + myName);

	}

}
