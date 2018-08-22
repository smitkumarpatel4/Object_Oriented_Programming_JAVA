package oop_concept;

public class User {

	public static void main(String[] args) {
		Mobile M = new Mobile();
		
		M.setAll("Microsoft", 17999.99f, 500, false);
		M.discount(15.55f);
		System.out.println("________________________________");
		M.printAll();
		
	}

}
