package Command_line;

public class Array_String2 {

	public static void main(String[] args) {
		
		String name[] = {"Java","C++","HTML","Java Scripting"};
		
		
		for(int i=0;i<name.length;i++)   //two common mistakes....      //show length also
		{
		System.out.println("Programming language "+(i+1)+ " is  - " +name[i] );  //correct it
		
		}

	}

}
