package A_LAB_8.Prac2;

public class Student {
	int r_no;
	String name;
	
	Student()
	{
		
	}
	
	Student(int a,String s)
	{
		r_no=a;
		name=s;
	}
	
	void show()
	{
		System.out.println("Roll no= "+r_no);
		System.out.println("Name of student= "+name);
	}
	

}

