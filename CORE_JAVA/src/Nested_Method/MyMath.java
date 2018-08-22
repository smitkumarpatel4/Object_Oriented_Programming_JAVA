//Nesting of method Max , to find max of three numbers
package Nested_Method;

public class MyMath {
	
	//no variables to store data, bcz its created when required operation
	static int max(int x,int y)
	{
		if(x>y)
			return x;
		else 
			return y;
		
	}
	
	
	static int max(int x,int y,int z)
	{
		return  max(   max(x,y) , max(y,z)  );
	}
	


}
