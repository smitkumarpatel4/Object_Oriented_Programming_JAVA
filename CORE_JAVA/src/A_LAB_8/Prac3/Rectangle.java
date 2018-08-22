package A_LAB_8.Prac3;

public class Rectangle extends Shape{
	float length;
	float width;
	
	Rectangle()
	{
		
	}
	
	Rectangle(float l,float w)
	{
		length=l;
		width=w;
	}
	
	void area()
	{
		float a=length*width;
		System.out.println("area of rectangle is = "+a);
		
	}

	void circumference()
	{
		float c=2*length*width;
		System.out.println("circumference of rectangle is = "+c);
	}
	

}