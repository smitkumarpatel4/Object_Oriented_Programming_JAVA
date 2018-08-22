package A_LAB_9;

import java.util.Scanner;

public class Number_Formate_Exception {
public static void main(String[] args){
		
			int a=0,b=0,c=0;
			String num1;
			String num2;
			
			Scanner input=new Scanner(System.in);
			System.out.println(" enter the num1");
			num1=input.nextLine();
			System.out.println(" enter the num2");
			num2=input.nextLine();
		    a=Integer.parseInt(num1);
			b=Integer.parseInt(num2);
			 
			 
		
	    try
		{
	    	 c=a/b;
	    }
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	    catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
	}

}

