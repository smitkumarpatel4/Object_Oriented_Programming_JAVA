//We are extending an abstract class because we have to.
//Here we have to define an abstract method, to show how it works  
package Abstraction;

public class MyCalc extends BasicCalc{

	float  addition(float  x,float  y)
	{
		return x+y;
		
	}
	
	//Overriding or Loading ?
	
	int addition(int x,int y,int z)
	{
		return(x+y+z);
		
	}

	
	
	void printDemo()
	{
		
		System.out.println("Possible  Operations are: ");
		System.out.println(" addition(int x,int y) ");
		System.out.println(" addition(float  x,float  y) ");
		System.out.println(" addition(int x,int y,int z) ");
		
			
	}
	
	
	

}
