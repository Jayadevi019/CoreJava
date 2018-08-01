import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;


public class Collections_Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add("One");
		l1.add("Two");
		l1.add("Three");
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	Iterator i1=l1.iterator();
	while(i1.hasNext())
	{
		System.out.println("Forwarding "+ i1.next());
	}
	
	ListIterator i2=l1.listIterator();
	while(i2.hasNext())
	{
		System.out.println("Forwarding "+ i2.next());
	}
	while(i2.hasPrevious())
	{
		System.out.println("Reverse Order "+i2.previous());
	}
}

}
