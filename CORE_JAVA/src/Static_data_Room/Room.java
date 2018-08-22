//All the rooms have common, separate AC which can be operated by each room's own method

package Static_data_Room;


public class Room {
	
static boolean  ac;
	
	Room()
	{
	ac =true;	  //default AC is on, you can make here false also
	} 
	
	//to turn AC on, regardless ke pahele ye AC on tha ya nahi
	void turnOn()
	{
		ac = true;
	}
	
	//to turn AC off, regardless ke pahele ye AC off tha ya nahi
	void turnOff()
	{
		ac = false;
	}
	
	//to invert the status, yaha pahele check krna padega ke ON tha ya OFF ? then invert it
	void invertStatus()
	{
		if(ac == true)
		{
			ac=false;
		}
		else
		{
			System.out.println("The light is currently OFF");
		     ac =true;
		}
		
	}
	
 	
	//Kisi bhi room me se check krna hai, K abhi ON hai ya OFF
	void showStatus()
	{
		if(ac==true)
			System.out.println("AC is currently ON");
		else
			System.out.println("AC is currently OFF");
		
	}

}
