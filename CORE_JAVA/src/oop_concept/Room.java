package oop_concept;

public class Room {
	
	 float length;
	 float width;

	
	void setRoom(float l,float w)
	{
		
	length = l;
	width =w;
	}
	
	
	void printArea()
	{
	float area = length*width;
	System.out.println("The area is "+area); 
	
		
	}
	
	float giveMeArea()
	{
	float area = length*width;
	return(area);
	
		
	}
	
	

}
