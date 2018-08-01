class Places implements Cloneable
{
	String name;
	String country;
	long population;
	public Places(String name, String country, long population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
public class Clonable_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Places p1=new Places("Ooty","India",13l);
		
		System.out.println(p1.country);
		System.out.println(p1.name);
		System.out.println(p1.population);
		Places p2=null;
		try {
			p2=(Places)p1.clone();
		}catch(CloneNotSupportedException ce)
		{
			System.out.println("Cloning is not available for this object");
			ce.printStackTrace();
		}
		System.out.println(p2.country);
		System.out.println(p2.name);
		System.out.println(p2.population);

	}

}
