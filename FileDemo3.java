import java.io.*;
public class FileDemo3 {
public static void main(String[] args) throws IOException
{
	File f1=new File("C:\\Deloitte\\FirstProject\\file1");
    boolean created=f1.createNewFile();
    if(created==true)
    { 
    	System.out.println("File created");
    }
    else
    {
    	System.out.println("Could Not create");
    }
    
	File f=new File("C:\\Deloitte\\FirstProject\\Folder1");
	boolean status=f.mkdir();
	if(status)
	{
		System.out.println("File created");
	}
	else
	{
		System.out.println("File Not created");
	}
}
}

