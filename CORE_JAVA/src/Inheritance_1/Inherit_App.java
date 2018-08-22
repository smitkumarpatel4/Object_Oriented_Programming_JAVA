package Inheritance_1;
//Application which can have bedroom and rooms in it

public class Inherit_App {

	
	public static void main(String[] args) {
    Bedroom B_room = new Bedroom(20,30,40);
    int B_area = B_room.area();     //superclass method
    int B_volume= B_room.volume();
    
    System.out.println("Bedroom area is : "+B_area);
    System.out.println("Bedroom Volume is : "+B_volume);
    B_room.Display();
    
    
    
    

	}

}
