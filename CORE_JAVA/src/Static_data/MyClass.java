//To demonstrate use of static data - common for all objects, they share it
//If you want to count the objects, all object must know what was the previous count 
//Meaning the count must be shared among all object and if it is changed by any of the oebject it
//must be reflected when accessed again

package Static_data;

public class MyClass {
	 static  int icount;
	 

	//default constructor
	MyClass(){
		       icount++;
	         }
	
	void printDetails()
	{
		System.out.println("I Object your Honour. My number is => "+icount);
		
	}
}
