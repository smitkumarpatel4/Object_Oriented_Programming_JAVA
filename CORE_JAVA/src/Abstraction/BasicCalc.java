 //This is a basic calc, an abstract class
//You can make object of an abstract class
//you must extend this class first, and you have to override abstract method  
//abstract method cannot have body
package Abstraction;

//not possible ->  abstract construtor or static method 
public abstract class BasicCalc {
	
	// float num1, num2 ;   Not needed
	
	int addition(int x,int y)
	{
		return(x+y);
		
	}
	
	

	static int multi(int x,int y)
	{
		return(x*y);
		
	}
	
	
	
	abstract void printDemo();

}
