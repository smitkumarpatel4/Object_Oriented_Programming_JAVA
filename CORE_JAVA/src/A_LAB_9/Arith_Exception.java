package A_LAB_9;
import java.util.Scanner;
public class Arith_Exception {

	public static void main(String[] args){
		 int c;	
		try
		{	
			Scanner input=new Scanner(System.in);
		
			System.out.println(" enter the num1");
			int num1=input.nextInt();
			System.out.println(" enter the num2");
			int num2=input.nextInt();
		
			 c = num1/num2;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}
