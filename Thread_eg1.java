class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
	}
class SecondThread extends Thread
{
	public void run()
	{
		for(int i=15;i<=20;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}}
public class Thread_eg1 {
	public static void main(String[] args)
	{
		FirstThread f1=new FirstThread();
		
		f1.setName("MyThread1");
		SecondThread s1=new SecondThread();
		f1.start();
		s1.start();
		s1.setName("MyThread2");
	}

}
