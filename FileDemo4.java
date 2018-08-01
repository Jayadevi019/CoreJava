import java.io.File;
import java.io.IOException;
public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Deloitte\\FirstProject\\file1");
		if(f.exists())
		{
			System.out.println("File is Present");
			boolean status=f.delete();
			if(status)
			{
				System.out.println("Deleted");
			}
			else
			{
				System.out.println("Could not delete");
			}	}
			else
			{
				File f1=new File("C:\\Deloitte\\FirstProject\\file1");
				boolean created=f1.createNewFile();
				System.out.println("New File Created");		
			}
		
	}

}
