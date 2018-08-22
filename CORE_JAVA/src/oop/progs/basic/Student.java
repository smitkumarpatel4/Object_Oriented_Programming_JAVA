package oop.progs.basic;

public class Student {

	String name;
	boolean oop_std;
	float result;
	
	
	void setName(String n)
	{
		name = n;
	}
	
	void setOop(boolean os)
	{
	oop_std = os;	
	}
	
	void setResult(float r)
	{
		result = r;
		
	}
	
	
	void printResultPerc()
	{
		System.out.println("The result in precentage is "+(result-0.5f)*10);
	}
	
	
}


