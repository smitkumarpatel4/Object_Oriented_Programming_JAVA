package A_LAB_2;

import java.util.Scanner;
public class Calc_Sum {
	
	public static void main(String[] args)
	{
		
		Scanner input= new Scanner(System.in);
		float num1,num2,sum;
		System.out.println("enter two no");
		num1=input.nextFloat();
		num2=input.nextFloat();
		sum=num1+num2;
		System.out.println("sum of " +num1+ " and " +num2+ " is "+sum);
		
		
		
		
	}
}
