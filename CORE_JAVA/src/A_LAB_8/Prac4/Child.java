package A_LAB_8.Prac4;

public class Child extends Father{
		String name2;
		Child(String s,String s1,String s2)
		{
			super(s,s1);
			name2=s2;
		}
		
		void show()
		{
		super.show();
		System.out.println("Child name= "+name2);
		}

	}



