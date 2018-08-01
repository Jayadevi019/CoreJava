class NumberThread extends Thread
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	System.out.println(i);
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getState());
	}
	
	}
class AlphaThread extends Thread
{
	public void run()
	{
		for(char c='a';c<='e';c++)
		
			System.out.println(c);
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
		
	}}
public class Thread_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberThread at=new NumberThread();
		at.setName("Number Thread");
		at.start();
		AlphaThread a1=new AlphaThread();
		a1.start();
		a1.setName("Alpha Thread");
		
	}

}
