package A_LAB_8.Prac2;

public class Result extends Student implements Test {
	
	float avg_result;
	int m1,m2,m3;
	Result(int a,int b,int c,int d,String s)
	{
		super(a,s);
		m1=b;
		m2=c;
		m3=d;
	}
	public void avg_result()
	{
		avg_result=(m1+m2+m3)/3;
	}
	
	void display_all()
	{
	    super.show();
		System.out.println("average result= "+avg_result);
	}
	
	

}
