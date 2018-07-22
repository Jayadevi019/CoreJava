class Square
{
	double a;
}
class Triangle
{
	double h;
	double l;
}
class Circle
{
	double r;
	}
class AreaofShape
{
	public double calcArea(Square s)
	{
		return s.a*s.a;
	}
	public double calcArea(Triangle t)
	{
		return t.h*t.l;
	}
	public double calcArea(Circle  c)
	{
		return 3.14*c.r*c.r;
	}
	
	
}
class Shape
{
	public static void main(String...args)
	{
		Square s=new Square();
		s.a=10;
		Triangle t=new Triangle();
		t.l=5;
		t.h=3;
		Circle c=new Circle();
		c.r=4;
		AreaofShape as = new AreaofShape();
		double a1=as.calcArea(s);
		double a2=as.calcArea(t);
		double a3=as.calcArea(c);
		System.out.println("Area of Square is "+a1);
		System.out.println("Area of Triangle is "+a2);
		System.out.println("Area of Circle is "+a3);
	}
}