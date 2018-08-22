package A_LAB_7.prac3_overloading;

public class Poly_Add {
	
	int Add (int x,int y)
	{
		return(x+y);
	}
	
	float Add (float x,float y)
	{
		return(x+y);
	}

	String Add(String x,String y)
	{
		return(x+y);
	}
	float[] Add(float x[],float y[])
	{
		float z[]=new float[x.length];
		int i;
		for(i=0;i<x.length;i++)
		{
			z[i]=x[i]+y[i];
			System.out.println("Additon= "+z[i]);
		}
		return z;
		
	}
	
}
