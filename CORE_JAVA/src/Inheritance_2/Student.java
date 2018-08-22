package Inheritance_2;
//Base class Student, should be created first 

public class Student {
String name;
int roll_no;

Student(String name,int roll_no)   //constructor
	{
	this.name	= 	name;
	this.roll_no=	roll_no;
	}


void Show_details()
{
System.out.println("Name of student is " +name);
System.out.println("Roll number of student is " +roll_no);

}
	
}
