import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_eg5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Values:");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int big=0;
		for(int i=1;i<=5;i++)
		{
			
			int ii=Integer.parseInt(br.readLine());
			if(big<ii)
			{
				big=ii;
			}
			 
         
	    }
		System.out.println("The Biggest Number is "+big);

}
}