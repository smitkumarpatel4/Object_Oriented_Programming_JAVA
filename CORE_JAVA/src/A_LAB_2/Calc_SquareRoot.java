package A_LAB_2;

import java.util.Scanner;
import java.lang.Math;

public class Calc_SquareRoot {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double  num,ans;
		System.out.println("enter a number");
		num=input.nextDouble();
		ans= Math.sqrt(num);
		System.out.println(+ans+ " is square root of "+num);
		
	}

}
