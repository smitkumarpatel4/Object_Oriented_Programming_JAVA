package Vector_Programs;
import java.util.Scanner;
import java.util.Vector;
public class NetShopping
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
				int x;
				System.out.println("You had Added these items to your Cart:" +Cart);
				
				System.out.println("Choose what you want to do... (1)Add items/(2)Remove Items/(3)Procced for the Payment.");
				x=Input.nextInt();
				
				if(x==1)
				{
	go:   {				System.out.println("Please enter the items you want to add:");
					 b=Input.nextLine();
					 Cart.addElement(b);
					 System.out.println("add Now You have this items in your Cart:" +Cart);
					 
					 System.out.println("Do you want to add more Items? Enter Y/N:");
					 c=Input.nextLine();
					 if(c=="Y"||c=="y")
					 {
						 //goto go;
					 }
					 
					 else
						{
						 System.out.println("Do you want to Proceed for Payment now or later? Enter Y/N");
		     			 b=Input.nextLine();
		     			 
		     			 if(b=="Y"||b=="y")
		     			 {
		     				System.out.println("Thanks for the Visit... Your items will be sent to your Billing Address...");
		     				
		     			 }
		     			 else
		     			 {
		     				System.out.println("Your items which are added in cart are being saved and you can continue from here next time... Thank you for visit.");
		     				
		     			 }
						}
				}
					
				
				}
				
				
				
				
				
				
				
				
				
			
				

			}

	}
