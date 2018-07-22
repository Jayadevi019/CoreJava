
public class Net_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double salary=15000,tax=0,allowance=0,netSal=0;
     tax=salary*0.1;
     allowance=salary*15.0/100.0;
     netSal=salary-tax+allowance;
     System.out.println("The Net Salary is "+netSal);
     System.out.println("The Salary is "+salary);
     System.out.println("The Tax is "+tax);
     System.out.println("The Allowance is "+allowance);
     
	}

}
