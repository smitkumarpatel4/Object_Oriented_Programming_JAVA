package oop_concept;

public class House {

	public static void main(String[] args) {
	
		Room br = new Room();
		br.setRoom(50.2f, 10);
		br.printArea();
		
		Room dr = new Room();
		dr.setRoom(20.2f, 10);
		dr.printArea();
		
		
		float temp = br.giveMeArea();
		
		

	}

}
