package A_LAB_3;

import java.util.Scanner;
public class Array2 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		
		float age[]=new float[5];
		
		for(i=0;i<age.length;i++)
			{
			System.out.println("enter the num");
			age[i]=input.nextFloat();
		System.out.println("Age is " +i+ "=" +age[i]);		
	     }
    }
}
