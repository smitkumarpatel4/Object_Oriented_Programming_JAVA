package A_LAB_2;

import java.util.Scanner;


public class Cal_Intrest {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Float P,R,T,SI;
		System.out.println("enter the principal");
		P=input.nextFloat();
		System.out.println("enter the intrest rate");
		R=input.nextFloat();
		System.out.println("enter the time period in year");
		T=input.nextFloat();
		SI=(P*R*T/100);
		System.out.println("the simple intrest is "+SI);
	}

}
