
public class Band {

	String bandName;
	String[]sarr= {};
	String[]garr= {};
	String drummer;
	String keyPlayer;
	
	public void setBandDetails(String bandName,String[]sarr,String[]garr,String dummer,String keyPlayer)
	{
		this.bandName=bandName;
		this.sarr=sarr;
		this.garr=garr;
		this.drummer=dummer;
		this.keyPlayer=keyPlayer;
	}
	public void printBandDetails()
	{
		System.out.println(bandName);
		for (int i=0;i<sarr.length;i++)
		{
		System.out.println(sarr[i]);
		}
		for(int i=0;i<garr.length;i++)
		{
		System.out.println(garr[i]);
		}
		System.out.println(drummer);
		System.out.println(keyPlayer);
	}
	public int countMembers()
	{
		return 2+sarr.length+garr.length;
	}
	
	
	
}
