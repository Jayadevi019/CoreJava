import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_eg3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the name: ");
		String myName = br.readLine();
		System.out.println("Enter City");
		String myCity=br.readLine();
		

System.out.println("Welcome " + myName);
System.out.println("You are Living in "+myCity);
	}

}
