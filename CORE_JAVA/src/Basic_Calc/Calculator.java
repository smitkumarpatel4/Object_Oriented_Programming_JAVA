package Basic_Calc;

public class Calculator {
	
	int num1;
	int num2;
	int ans;
	
	//make accessor method
	
void setdata(int a,int b)
	{
		num1 =a;
		num2=b;
	
	}
	

void printdata()
{
	System.out.println("The answer is "+ans);
	

}

void summation()
{
	ans = num1+num2;
}

void subtra()
{
	ans = num1-num2;
}
	
}
