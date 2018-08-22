package A_LAB_5;


public class City_Assending_Order {

	
	public static void main(String[] args) {
		String city[]={"Ahemdabad","Bombay","Rajkot","Jaipur","Newjurcy","Surat","Culcutta","Goa","Banglor","Delhi"};
        String temp=null;
        int i,j;
        for ( i=0;i<city.length;i++)
        {
        	
        	  for ( j=0;j<city.length-1;j++)
        	  
        	  {
        		  if(city[j].compareTo(city[j+1])>0)
        		  {
        			  temp=city[j];
        			  city[j]=city[j+1];
        			  city[j+1]=temp;
        		 }
        	  }
        }
        for ( i=0;i<city.length;i++)
        {  
        	System.out.println(city[i]);
        }
	}
	}


