import java.util.ArrayList;
import java.util.Collections;
public class CollectionClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		ArrayList a2=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(6);
		a1.add(5);
		a1.add(6);
		a2.add(13);
		a2.add(13);
		a2.add(13);
		a2.add(13);
		a2.add(13);
		a2.add(13);
		a2.add(13);
		System.out.println(a1);
		System.out.println(Collections.binarySearch(a1,2));
		Collections.shuffle(a1);
		System.out.println(a1);
		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));
		System.out.println(Collections.frequency(a1,6));
	    Collections.copy(a2,a1);
	    System.out.println(a2);
	  //  Collections.fill(a1,1319);
	    System.out.println(a1);
	Collections.rotate(a1, 2);
	System.out.println(a1);
	Collections.reverse(a1);
	System.out.println(a1);
	Collections.replaceAll(a1, 1, 13);
	System.out.println(a1);
		}
}
