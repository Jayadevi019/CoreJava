class Rest
{
	// !Devi!
	public synchronized  void  takeLunch(String name)
	{
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");

	}
}

class RestThread extends Thread {
	String name;
	Rest rest;

	 RestThread(String name, Rest rest) {
		this.name = name;
		this.rest = rest;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		rest.takeLunch(this.name);
	}
}

public class Thread_eg4
{
	public static void main(String[] args)
	{
		Rest r = new Rest();
		
		RestThread t1=new RestThread("Devi", r);
		RestThread t2=new RestThread("Rakshana", r);
		t1.start();
		t2.start();
		
	
	}
}
