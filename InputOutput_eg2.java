import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_eg2 {

	public static void main(String [] args) throws NumberFormatException, IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter an Integer");
		int i=Integer.parseInt(br.readLine());
		if(i%3==0)
		{
			System.out.println(i+" is divisible by 3");
		}
		else
		{
			System.out.println(i+" is  not divisible by 3");
		}
		
	}
}
