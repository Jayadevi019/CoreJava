import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	a1.add("Jaya");
	a1.add(1319);
	a1.add("Mahe");
	a1.add(true);
	a1.add("Rakshanaa");
	a1.add(1319);
	a1.add(32.23);
	a1.add("Hello");
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(13);
	a1.add(19);
	System.out.println(a1.get(2));
	System.out.println("Size is "+a1.size());
	a1.add(0, "Govindharasu");

	for(int i=0;i<a1.size();i++)
	{
	if(a1.get(i).equals("Hello"))
	{
		a1.remove(i);
	a1.add(i, "World");	
	}
	System.out.println(a1.get(i));
	
	}
	}}

