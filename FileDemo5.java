import java.io.File;
public class FileDemo5 
{
	public static void main(String[] args) 
	{
    File f=new File("C:\\Deloitte");
    if(f.canRead())
    {
    	System.out.println("Can RAED");
    }
    if(f.canWrite())
    {
    	System.out.println("Can Write");
    }
    if(f.canExecute())
    {
    	System.out.println("Can Read and write");
    }
    String afiles[]=f.list();
    for(int i=0;i<afiles.length;i++)
    {
    	System.out.println(afiles[i]);
    }
	}
}
