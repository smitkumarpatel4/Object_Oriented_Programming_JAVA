package A_LAB_8.Prac3;

public class Circle extends Shape {
    double radius;
    
    
	Circle()
	{
		
	}
	Circle(double r)
	{
		radius=r;
		
	}

	void area() 
	{
		double a;
		a=pi*(radius*radius);
		System.out.println("area of circle is = "+a);
	}
	
    
    void circumference()
     {
	double c=2*pi*radius;
	System.out.println("circumference of circle is = "+c);
     }
	
}

