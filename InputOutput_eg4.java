import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_eg4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Values:");
		double sum=0,avg=0;
		for(int i=1;i<=5;i++)
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			int ii=Integer.parseInt(br.readLine());
			sum=sum+ii;
				
		}
		avg=sum/5;
		System.out.println("The Average is "+avg);
		

	}

}
