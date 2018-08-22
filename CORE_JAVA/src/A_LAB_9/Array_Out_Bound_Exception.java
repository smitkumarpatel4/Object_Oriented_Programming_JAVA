package A_LAB_9;

import java.rmi.AlreadyBoundException;


public class Array_Out_Bound_Exception {

	
	public static void main(String[] args) {
		
		try
		{
			
		int x[]={5,3};
		x[4]=42;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println(e);
		}
	}

}
