
public class Employee3  implements Comparison{
	String ename;
	double salary;
	public Employee3(String ename,double salary)
	{
	   this.ename=ename;
	   this.salary=salary;
	}
	public void whichIsGreater(Object o1,Object o2)
	{
		Employee3 e=(Employee3)o1;
		Employee3 e1=(Employee3)o2;
		if(e.salary>e1.salary)
		{
			System.out.println(e.ename+" is Greater");
		}
		else
			System.out.println(e1.ename+" is Greater");
		
		
	}

}
