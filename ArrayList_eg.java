import java.util.*;
class Cars implements Comparable
{
	String color;
int price;
public Cars(String color, int price) {
	super();
	this.color = color;
	this.price = price;
}
@Override
	public String toString()
{
	return this.color+" "+this.price;
	}



@Override
	public int compareTo(Object o) 
{
	Cars cc=(Cars)o;
	return this.color.compareTo(cc.color);

	}

	}
public class ArrayList_eg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
//	ArrayList a1=new ArrayList();
//	a1.add("mahe");
//	
//	a1.add("Rakshanaa");
//		a1.add("Uthra");
//		a1.add("Mahe");
//		a1.add("Jaya");
//		a1.add("jaya");
//		
//		System.out.println("Before"+a1);
//		Collections.sort(a1);
//		System.out.println("After"+a1);
//		
		
		Cars c1=new Cars("Black",32);
		Cars c2=new Cars("White",12);
		Cars c3=new Cars("Blue",19);
		Cars c4=new Cars("Red",13);
		Cars c5=new Cars("Grey",11);
		ArrayList a1=new ArrayList();
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		a1.add(c5);
		Collections.sort(a1);
		
	System.out.println(a1);	
	}

}
