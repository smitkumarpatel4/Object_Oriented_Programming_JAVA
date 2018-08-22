package A_LAB_7.prac3_overloading;

public class Poly_Application {
	
	static float z[];

	public static void main(String[] args){
		Poly_Add p=new Poly_Add();
		
		int ans1=p.Add(22,11);
		System.out.println(ans1);
		
		float ans2=p.Add(22.00f,11.45f);
		System.out.println(ans2);
		
		String ans3=p.Add("Smit"," Patel");
	    System.out.println(ans3);
	    
	    
	    float a[]={3.0f,4.1f,5.2f};
	    float b[]={1.2f,2.3f,5.6f};
	    
	    z = p.Add(a,b);
		
	
	
	}
	

	

}
