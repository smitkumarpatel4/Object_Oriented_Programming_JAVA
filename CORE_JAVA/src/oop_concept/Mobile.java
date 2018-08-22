package oop_concept;


public class Mobile {
	
		String brand;
		float price;
		float balance;
		boolean android;
		
		void setBrand(String b)
		{  
		brand = b;
		}
		
		void setPrice(float p)
		{  
		price = p;
		}
		
		void setBalance(float rech)
		{  
		balance = rech;
		}
				
		void setOs(boolean andr)
		{  
		android = andr;
		}
		
		void setAll(String b,float p,float rech,boolean andr)
		{
			brand =b;
			price=p;
			balance=rech;
			android=andr;
		}
	
		
		void printAll()
		{
			System.out.println("The Brand name is "+brand);
			System.out.println("The price is "+price);
			System.out.println("The current balance is "+balance);
			System.out.println("It has android system - "+android);
		}
		
		void discount(float disc)
		{	
		price = price - (price*disc/100);
		System.out.println("Congrates. You got "+disc+ "% discount on price");
		}
		
	
		void Calling(float mins)
		{
		//assume call rate 50 per minute	
		balance = balance - (mins*0.50f);
		System.out.println("Last call was for "+mins+" minutes");
		System.out.println("Balance deducted : "+(mins*0.50f));
		System.out.println("Current balance is "+balance);
		}
	
	
}	
		
		
	


