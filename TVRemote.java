
interface TVRemote1
{
	public void switchoff();
	public void switchon();
	public void changechannel();
	public void increaseVolume();
	public void decreaseVolume();
}
class Sony implements TVRemote1
{ 
	public void switchoff()
	{
		System.out.println("TV Switched Off");
	}
	public void switchon()
	{
		System.out.println("TV Switched On");
	}
	public void changechannel()
	{
		System.out.println("Channel Changed");
	}
	public void increaseVolume()
	{
		System.out.println("volume Increased");
	}
	public void decreaseVolume()
	{
		System.out.println("Volume Decreased");
	}
	
	
	
}

public class TVRemote
{
	public static void main(String[] args)
	{
		Sony s=new Sony();
		s.switchoff();
		s.switchon();
		s.changechannel();
		s.increaseVolume();
		s.decreaseVolume();
	}
	}