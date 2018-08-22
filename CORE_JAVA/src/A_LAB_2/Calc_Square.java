package A_LAB_2;

import java.util.Scanner;
public class Calc_Square {
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		float num,square;
		System.out.println("enter a no");
		num=input.nextFloat();
		square=num*num;
		System.out.println(+square+ " ia square of " +num);
		
	}

}
