import java.util.HashSet;

class MobilePhone{
	String name;
	int price;
	MobilePhone(String name,int price)
	{  super();
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
	
		return this.name+" "+this.price;
	}
	@Override
	public boolean equals(Object obj) {
		MobilePhone mm=(MobilePhone)obj;
		if(this.name.equals(mm.name)&&this.price==mm.price)
		{
		return true;
		}
		else
		{
			return false;
	}}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.price*5; 
	}
		
		// TODO Auto-generated method stub

	}
public class Set_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MobilePhone mp1=new MobilePhone("Samsung",1000);
MobilePhone mp2=new MobilePhone("Samsung",1000);
MobilePhone mp3=new MobilePhone("Samsung",1300);
MobilePhone mp4=new MobilePhone("Samsung",1900);
HashSet h1=new HashSet();
h1.add(mp1);
h1.add(mp2);
h1.add(mp3);
h1.add(mp4);
System.out.println(h1);

	}

}
