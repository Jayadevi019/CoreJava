class A
{
	void m1()
	{
System.out.println("Parent Class");	
}
	}
class B extends A
{
	void m1()
	{
System.out.println("Child Class");	
}
	}
public class Inheritance_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();
		obj.m1();
		

	}

}
