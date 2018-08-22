package Basic_Calc;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator calc = new Calculator();   //default constructor, to allocate memory to an object
       calc.setdata(10,20);
       //Printing stuff........
       calc.summation();
       calc.printdata();
    
       calc.subtra();
       calc.printdata();
       
		 
		
	}

}
