 /*
class thread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		System.out.println("Thread1    " + i);
	}

	
}
class thread2 implements Runnable
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		System.out.println("Thread2     " + j);
	}

}


public class MultiThreadTest
{
	

	public static void main(String[] arg)
	{
		thread1 t1=new thread1();
		thread2 t2 = new thread2();

		Thread thobj1 = new Thread(t1);
		Thread thobj2=new Thread(t2);

		
		thobj1.start();
		thobj2.start();
		
	}
}
*/
class thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		System.out.println("Thread1    " + i);
	}

	
}
class thread2 extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		System.out.println("Thread2     " + j);
	}

}


public class MultiThreadTest
{
	

	public static void main(String[] arg)
	{
		thread1 t1=new thread1();
		thread2 t2 = new thread2();

			
		t1.start();
		t2.start();
		
	}
}


