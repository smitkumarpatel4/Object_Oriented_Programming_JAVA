package A_LAB_8.Prac4;

public class Father extends Grandfather{
	String name1;
	Father(String s,String s1)
	{
		super(s);
		name1=s1;
	}
	
	void show()
	{
		super.show();
		System.out.println("father name= "+name1);
	}

}
