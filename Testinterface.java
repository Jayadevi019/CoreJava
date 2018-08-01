
public class Testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e2=new Employee3("Mahe", 35000.00);
		Employee3 e3=new Employee3("Jaya", 25000.00);
		Employee3 e4=new Employee3(null, 0.0);
		e4.whichIsGreater(e2, e3);
		Apple a2=new Apple("Kashmir", 350.00);
		Apple a3=new Apple("Ooty", 450.00);
		Apple a4=new Apple(null, 0.0);
		a4.whichIsGreater(a2, a3);
        
	}

}
