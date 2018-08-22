package A_LAB_9.Neg_Exception;
import java.util.Scanner;

public class Neg_num {

	public static void main(String[] args){
		
		int a;
		try
		{
			System.out.println("enter the number");
			Scanner Input=new Scanner(System.in);
			a=Input.nextInt();
			if(a<0)
			{
				throw new NegException(a);
			}
			
		}
		catch(NegException e)
		{
			System.out.println(e);
		}
	}
	
}
