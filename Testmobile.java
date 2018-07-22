
public class Testmobile {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		SampleClass m1=new SampleClass();
		m1.brandName="Samsung";
		m1.price=25000.00;
		m1.color="Black";
		System.out.println(m1.brandName);
		System.out.println(m1.color);
		System.out.println(m1.price);
		m1.makeACall();
		double g=m1.getDiscount();
		System.out.println(g);
	}

}
