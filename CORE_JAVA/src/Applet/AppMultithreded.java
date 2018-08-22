package Applet;

public class AppMultithreded {
	
	public static void main(String args[])
	{
		ThreadA  objA = new ThreadA();
		ThreadB  objB = new ThreadB();
		ThreadC  objC = new ThreadC();
		
		objA.start();
		objB.start();
		objC.start();
		
		
	}

}


class ThreadA extends Thread{
	public void run()
	{
		
		for(int i=0;i<1000;i++)
		{
			
			System.out.println("I am from Class-A with "+i);
		}
		
	}
	
}

class ThreadB extends Thread{
	public void run()
	{
	
		for(int i=0;i<1000;i++)
		{
					System.out.println("I am from Class-B with "+i);
		}
		
		
	}
	
}

class ThreadC extends Thread{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("I am from Class-C with "+i);
		}
	}
	
}
