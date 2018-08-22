package A_LAB_6;

import java.util.Scanner;
public class Shopping {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char choice;
	    String name;
	    System.out.println(" enter your choice ");
	    name=input.nextLine();
	    choice=name.charAt(0);
	    switch(choice)
	    {
	    case'A': System.out.println("you got 10% discount");
	    break;
	    case'a': System.out.println("you got 10% discount");
	    break;
	    case'B': System.out.println("you got 20% discount");
	    break;
	    case'b': System.out.println("you got 20% discount");
	    break;
	    case'C': System.out.println("you got 30% discount");
	    break;
	    case'c': System.out.println("you got 30% discount");
	    break;
	    case'D': System.out.println("you got 40% discount");
	    break;
	    case'd': System.out.println("you got 40% discount");
	    break;
	    default: System.out.println("better luck for next time");
	    }
   
     }

}
