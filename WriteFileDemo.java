import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFileDemo {
public static void main(String[]args) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
FileWriter fw=new FileWriter("C:\\Deloitte\\My Programs\\src\\sample4.txt");
BufferedWriter bw=new BufferedWriter(fw);

System.out.println("Enter the text ");
String text=br.readLine();
while(!text.equalsIgnoreCase("STOP")) 
{
	bw.write(text);
	bw.newLine();
	System.out.println("Enter the text ");
	 text=br.readLine();
	
}
bw.close();

System.out.println("File Created");
}


}
	