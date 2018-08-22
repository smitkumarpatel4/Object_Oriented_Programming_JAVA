package A_LAB_7;


public class Calculator {
	float x;
	float y;
	float ans;

	Calculator()
	{ 
		x=0.00f;
		y=0.00f;
			}
	Calculator(float a,float b)
	{
		x=a;
	    y=b;
	}
	
	void addition()
	{
	ans=x+y;
	System.out.println(" addition= "+ans);
	}
	void subtraction()
	{
	ans=x-y;
	System.out.println(" subtraction= "+ans);
	}
	void multiplication()
	{
	ans=x*y;
	System.out.println(" multiplication= "+ans);
	}
	void divison()
	{
	ans=x/y;
	System.out.println(" divison= "+ans);
	}
}