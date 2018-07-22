class Mobile
{
	public void switchoff()
	{
		System.out.println("Switching off...");
	}
	public void makeACall()
	{
		System.out.println("Connecting the Call");
	}
	}
class Smartphone extends Mobile
{
	public void browswer()
	{
		System.out.println("Browsing...");
	}
	public void games()
	{
	System.out.println("Playing Games");	
	}
	}

public class InheritanceDemo {

	public static void main(String []args)
	{
		Smartphone sp=new Smartphone();
		sp.games();
		sp.makeACall();
		
	}
}
