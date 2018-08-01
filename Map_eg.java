import java.util.*;
import java.util.Iterator;
public class Map_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(3,"One");
		hm.put(2,"Two");
		hm.put("3","Three");
System.out.println(hm);
Set keys=hm.keySet();
Iterator i1=keys.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
	}

 

TreeMap hm1=new TreeMap();
hm1.put(3,"One");
hm1.put(2,"Two");
hm1.put(3,"Three");
System.out.println(hm1);
Set keys1=hm1.keySet();
Iterator i11=keys1.iterator();
while(i11.hasNext())
{
System.out.println(i11.next());}
}

}