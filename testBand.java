
public class testBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Band b1=new Band();
Band b2=new Band();
String singers[]= {"a","b","c"};
String gs[]= {"x","y","z"};
String sing[]= {"m","n","o","p"};
String guit[]= {"j","k","l","q","r"};
b1.setBandDetails("Justin", singers, gs, "Mani", "Vinod");
b1.printBandDetails();
b2.setBandDetails("ARR", sing, guit, "Hari", "Priya");
b2.printBandDetails();
int a=b1.countMembers();
int b=b2.countMembers();
	if(a>b)
	{
		System.out.println("The band B1 has more artists");
	}
	else if(a<b)
	{
		System.out.println("The band B2 has more artists");
	
	}
	else
	{
		System.out.println("Same count of artists");
	}
	}

}
