class Greeting
{
	// !Devi!
	public synchronized void  sayHelo(String name)
	{
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");

	}
}

class GreetingThread extends Thread {
	String name;
	Greeting greeting;

	GreetingThread(String name, Greeting greeting) {
		this.name = name;
		this.greeting = greeting;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		greeting.sayHelo(this.name);
	}
}

public class Thread_eg3
{
	public static void main(String[] args)
	{
		Greeting g = new Greeting();
		
		GreetingThread gt1=new GreetingThread("Devi", g);
		GreetingThread gt2=new GreetingThread("Rakshana", g);
		gt1.start();
		gt2.start();
		}
}
