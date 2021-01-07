class thread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread1");
	}

	public static void main(String[] arg)
	{
		thread1 obj1=new thread1();
		Thread t= new Thread(obj1);
		t.start();	
	}
}

/*
class thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread1");
	}

	public static void main(String[] arg)
	{
		thread1 obj1=new thread1();
		obj1.start();
	}
}*/