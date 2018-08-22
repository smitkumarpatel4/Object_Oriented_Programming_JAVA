package Inheritance_2;
//extending base class Student to make a new class JavaStudent

public class JavaStudent extends Student {
    boolean prog_know;
	JavaStudent(String name,int roll_no,boolean prog_know)
	{
		super(name,roll_no);
		this.prog_know=prog_know;
		
	}
	
	void Show_details()
	{
	System.out.println("Name of student is " +name);
	System.out.println("Roll number of student is " +roll_no);
	System.out.println("Programming of student is "  +prog_know);
	
	}
}
