package Online_Shop;
import java.util.Scanner;
import java.util.Vector;
public class OnlineShopping
{

	public static void main(String[] args) 
	{
		Vector Cart=new Vector(5);
		Scanner Input=new Scanner(System.in);
		String b;
		String c;
		String add[]=new String[5];
		
		System.out.println("Welcome to the Worlds Biggest Online Store...");
		
		for(int i=0;i<add.length;i++)
		{
			System.out.println("please enter the name of items you wished to add to Cart:");	
			add[i]=Input.nextLine();
			Cart.addElement(add[i]);
		}
		String x;
		System.out.println("You had Added these items to your Cart:" +Cart);
		
		System.out.println("Choose what you want to do... Add items/Remove Items/Procced for the Payment.");
		x=Input.nextLine();
		switch(x)
		{
			case "add":
	     	case "Add":System.out.println("Please enter the items you want to add:");
				 b=Input.nextLine();
				 Cart.addElement(b);
	add:	 {
				 System.out.println("Do you want to add more Items? Enter Y/N:");
				 c=Input.nextLine();
				 switch(c)
				 {
				 
				 case "y":
     			 case "Y":
     				if(c=="y"||c=="Y")
     				{
				 break add ;
     				}
     				break;
     			 case "n":
     			 case "N":System.out.println("Do you want to Proceed for Payment now or later? Enter Y/N");
     			 b=Input.nextLine();
				 
     			 	switch(b)
     			 	{
     			 	case "y":
     			 	case "Y":System.out.println("Thanks for the Visit... Your items will be sent to your Billing Address...");
     			 	break;
     			 	
     			 	case "n":
     			 	case "N":System.out.println("Your items which are added in cart are being saved and you can continue from here next time... Thank you for visit.");
     			 	break;
     			 	
     			 	default: System.out.println("You had entered wrong input...");
     				break;
     			 	}
     			 	
     			default: System.out.println("You had entered wrong input...");
    			break;
				 }
				 System.out.println("add Now You have this items in your Cart:" +Cart);
				break;
			}	 
				 break;
				
			
			case "remove":
			case "Remove":System.out.println("Please enter which item you want to remove:");
				 b=Input.nextLine();
				 Cart.removeElement(b);
				 System.out.println("Now You have this items in your Cart:" +Cart);
				 
	remove:	 {    System.out.println("Do you want to remove more Items? Enter Y/N:");
				 c=Input.nextLine();
				 switch(c)
				 {
				 
				 case "y":
     			 case "Y":
     				 if(c=="y"||c=="Y")
     				 {
				 break remove;
     				 }
     				 break;
     			 case "n":
     			 case "N":System.out.println("Do you want to Proceed for Payment now or later? Enter Y/N");
     			 b=Input.nextLine();
     			 	switch(b)
     			 	{
     			 	case "y":
     			 	case "Y":System.out.println("Thanks for the Visit... Your items will be sent to your Billing Address...");
     			 	break;
     			 	
     			 	case "n":
     			 	case "N":System.out.println("Your items which are added in cart are being saved and you can continue from here next time... Thank you for visit.");
     			 	break;
     			 	
     			 	default: System.out.println("You had entered wrong input...");
     				break;
     			 	}
     			 	
     			default: System.out.println("You had entered wrong input...");
    			break;
     			 
				 }
				 System.out.println("remove Now You have this items in your Cart:" +Cart);
				break;
			  }	 
			  break;
			  
			case "proceed":  
			case "Proceed":System.out.println("Do you want to Proceed for Payment now or later? Enter Y/N");
			 b=Input.nextLine();
			 	switch(b)
			 	{
			 	case "y":
			 	case "Y":System.out.println("Thanks for the Visit... Your items will be sent to your Billing Address...");
			 	break;
			 	
			 	case "n":
			 	case "N":System.out.println("Your items which are added in cart are being saved and you can continue from here next time... Thank you for visit.");
			 	break;
			 	
			 	//default: System.out.println("You had entered wrong input...");
				//break;
			 	}
			break;
			
			default: System.out.println("You had entered wrong input...");
			break;
		}
		

	}

}
