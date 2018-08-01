class NumberThread1 implements Runnable
{
	
	public void run()
	{
	for(int i=1;i<=5;i++)
	System.out.println(i);
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getState());
	}
	
	}
class AlphaThread1 implements Runnable
{
	public void run()
	{
		for(char c='a';c<='e';c++)
		
			System.out.println(c);
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
		
	}}
public class Thread_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new NumberThread1());
		t.setName("Number Thread");
		t.start();
		Thread t1=new Thread(new AlphaThread1());
		t1.start();
		t1.setName("Alpha Thread");
	}

}
