package A_LAB_3;

import java.util.Scanner;


public class AsendingOrder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i,sum=0;
		
		
		
		for(i=0;i<3;i++)
			
			{
			System.out.println("enter the num");
			int num[]=new int[3];
			num[i]=input.nextInt();
	
		sum=sum+num[i];
			}
		            System.out.println("sum of array "+sum);	          
    }
	

	}


