class Cot
	{
		double price;
	}
	class Chair
	{
		double price;
	}class Dining
	{
		double price;
	}

class furni {

	public double calcDiscount(Cot c)
	{
		return c.price*0.1;
		
	}
	public double calcDiscount(Chair cc)
	{
		return cc.price*0.15;
		
	}
	public double calcDiscount(Dining d)
	{
		return d.price*0.20;
		
	}
	
	
}

public class Furniture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cot c=new Cot();
		c.price=25000;
		furni f=new furni();
		double cd=f.calcDiscount(c);
		System.out.println("Cot Discount is "+cd);
		

	}

}

