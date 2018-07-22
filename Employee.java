
public class Employee {

	private int employeeId;
	private String empName;
	private double empSalary;
	static String companyName="Deloitte";
	public double calcBonus()
	{
		double bonus=0.0;
		if(this.empSalary<=5000)
			bonus=this.empSalary*0.2;
		else
			bonus=this.empSalary*0.1;
		return bonus;
	}
	
	public Employee() {
		super();
		this.employeeId=3213;
		this.empName="Mahe";
		this.empSalary=30000.00;
		System.out.println("Employee ID is "+this.employeeId);
		System.out.println("Employee Name is "+this.empName);
		System.out.println("Employee Salary is "+this.empSalary);
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String empName, double empSalary) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.empSalary = empSalary;
		System.out.println("Employee ID is "+ this.employeeId);
		System.out.println("Employee Name is "+this.empName);
		System.out.println("Employee Salary is "+this.empSalary);
	}
	public String getCompany()
	{
		return companyName;
	}
	
}
