package A_LAB_7.Prac2;

public class Rectangle {

		float length;
		float width;
		float ans;

	Rectangle()
		{ 
			length=10.00f;
			width=10.00f;
				}
	Rectangle(float a,float b)
		{
			length=a;
		    width=b;
		}
		
	Rectangle(float a)
	{
		length=width=a;
	}
	void area1()
	{
		ans=length*width;
		System.out.println("Area= "+ans);
	}
	}


