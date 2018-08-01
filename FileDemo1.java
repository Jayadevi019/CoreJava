import java.io.*;
public class FileDemo1 {

	public static void main(String[] args) throws IOException {
	FileInputStream fs=new FileInputStream("src/Hello.txt");
	int xx=fs.read();
		while(xx!=-1)
		{
			System.out.print((char)xx);
			xx=fs.read();
		}
		fs.close();
	}

}
