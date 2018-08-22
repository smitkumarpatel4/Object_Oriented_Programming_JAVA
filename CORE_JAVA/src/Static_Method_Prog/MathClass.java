//These methods are static, because they do their work same for entire class
//Static methods are supposed to work regardless of any objects data 
//Like all math operation methods are static method
//Static methods must be called with calss name, not object name
package Static_Method_Prog;

public class MathClass {
	
	//class methods (static methods)
	//Works for the class, not for particular object/instance.
	 static float mul(float x,float y)
	{
		return x*y;
	}
	
	static float divide(float x,float y)
	{
		return x/y;
	}
	
}
