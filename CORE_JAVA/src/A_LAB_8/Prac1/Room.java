package A_LAB_8.Prac1;

public class Room {

	float length; 
	float width;
	
	Room()
	{
		length=0.00f;
	    width=0.00f;
	}
	
	Room(float l,float w)
	{
		length=l;
	    width=w;
	}
	
	void show()
	{
	System.out.println("Area of Room = "+length*width);
	}
}
