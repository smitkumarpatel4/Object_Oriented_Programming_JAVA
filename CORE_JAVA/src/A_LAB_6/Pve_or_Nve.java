package A_LAB_6;

import java.util.Scanner;
public class Pve_or_Nve {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int i;
		System.out.println("enter the number");
		i=input.nextInt();
		if(i!=0)
		{
		      if(i<0)
		      {
			      System.out.println(i+ " number is negative ");
		      }
		      else
		      {
		          System.out.println(i+ " number is positive ");
		      }
		}
		else
		{
			System.out.println(" number is zero ");
		}
	}
		

}
