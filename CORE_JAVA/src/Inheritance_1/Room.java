package Inheritance_1;
//This is the base class, should be created first 


public class Room {
	int length;   //height is not a concern now, you are ANT
	int width;
	
	Room()
	{
		length=10;
		width=10;
	}
	Room(int L,int W)   //constructor   //also show duplicate constructor
	{
		length=L;
		width=W;
	}
		

	int area()   //to find an area
	{
		return(length*width);
	}
	
	
	void Display()
	 {
		System.out.println("Hello This is Method from base Class");
	 }
	
}
