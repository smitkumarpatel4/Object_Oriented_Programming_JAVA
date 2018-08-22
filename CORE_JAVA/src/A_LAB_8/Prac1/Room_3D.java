package A_LAB_8.Prac1;

public class Room_3D extends Room{
	
	float hight;
	
	Room_3D()
	{
		super();
		hight=0.00f;
	}
	
	Room_3D(float l,float w,float h)
	{
		super(l,w);
		hight=h;
	}
	
	void show()
	{
	System.out.println("Area of Room_3d= "+length*width*hight);
	}

}
