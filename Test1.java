abstract class person {
	String name,location;
	int age;
	public boolean doesHeBreathe()
	{
		System.out.println("Every Person Breathes");
		return true;
	}

	public boolean doesHeSleep() 
	{
		System.out.println("Every Person Sleeps");
		return true;
	}
	person()
	{
		System.out.println("I Am Constructor1");
	}

	public abstract boolean doesHeDrivesCar();
}

abstract class Employee2 extends person {
	public abstract boolean doesHeDrivesCar();
	Employee2()
	{super();
		System.out.println("I Am Constructor2");
	}
}

class Driver extends Employee2 {
	public boolean doesHeDrivesCar() 
	{
		System.out.println("Driving");
		return false;

	}
	Driver()
	{
		super();
		System.out.println("I Am Constructor3");
	}
}




public class Test1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Driver d1 = new Driver();
		System.out.println("Breathing??"+d1.doesHeBreathe());
		System.out.println("Sleeping?"+d1.doesHeSleep());
		System.out.println("Driving?"+d1.doesHeDrivesCar());

	}

}
