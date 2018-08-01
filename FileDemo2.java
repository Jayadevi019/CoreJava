import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileDemo2 {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("src/Hello.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
int flag=0;
		while(line!=null)
		{
			if(line.contains("Java"))
			{
			flag=1;
			break;
			}
			line=br.readLine();
			}
			if(flag==1)
			{
				System.out.println(line);
				System.out.println("Sucess");
			}
			else
			{
				System.out.println("Word is not Found");
			}
			
			

		fr.close();
	}

}
