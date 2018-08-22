//This program is developed to demonstrate user input - and square root
//Developed by : Programmer name
//Date : 2/3/2005 
//Project name : __________________


package oop.progs.basic;
import java.lang.Math;
import java.util.Scanner;

//interface statement 
//Other classes 

public class FindRoot {

public static void main(String args[])
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter a number ....");
	double num = kb.nextDouble();

	double ans = Math.sqrt(num);   //Math is a static class, 
                               //so direct use
	System.out.println("The square root of "+num+ " is "+ans);
	
}

}
