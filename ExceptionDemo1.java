
public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(5/0);
		}catch(ArithmeticException ae)
		{
			System.out.println("Can't divide by 0");
		}
		try {
			System.out.println(10/2);
		}catch(ArithmeticException ae)
		{
			System.out.println("Some Error in the code. Please check it again...");
		}
		System.out.println(1319);
	}
}
