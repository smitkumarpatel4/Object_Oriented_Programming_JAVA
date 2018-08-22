package A_LAB_6;

import java.util.Scanner;
public class Sentinel {

	
	public static void main(String[] args) {
		int num;
		int sum=0;
		int i=0;
		Scanner input=new Scanner(System.in);
		for(i=0;i<10000;i++)
		{
			System.out.println("enter the number");
			num=input.nextInt();
			if (num==0)
			{
			System.out.println("sum= "+sum);
			break;
			
		    }
       sum+=num;
	    }
	}
}