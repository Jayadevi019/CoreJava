import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_eg6 {
public static void main(String[]args) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int count=0;
System.out.println("Enter the cities: ");
String myCity=br.readLine();

while(!myCity.equalsIgnoreCase("STOP"))
{System.out.println("Enter the cities: ");
myCity=br.readLine();
count++;
}
System.out.println(count);

}

}
	
