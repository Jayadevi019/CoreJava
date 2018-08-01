import java.util.*;
public class Set_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1=new HashSet();

h1.add("Uthra");
h1.add("Ramu");
h1.add(1319);
h1.add("Jaya");
h1.add("Mahe");
System.out.println(h1);

LinkedHashSet lh1=new LinkedHashSet();
lh1.add("Uthra");
lh1.add("Ramu");
lh1.add(1319);
lh1.add("Jaya");
lh1.add("Mahe");
System.out.println(lh1);

TreeSet t1=new TreeSet();
t1.add(22);
t1.add(33);
t1.add(3);
t1.add(4);
t1.add(5);
t1.add(32);
System.out.println(t1);



}
	}
