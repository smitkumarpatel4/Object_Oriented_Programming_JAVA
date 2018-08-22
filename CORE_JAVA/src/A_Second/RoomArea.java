package A_Second;


public class RoomArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float area;
		Room room1 = new Room();   //new keyword to allocate the memory,known as  constructor 
		room1.setdata(2.5f,3.0f );
		area = room1.breadth * room1.length;
		
		System.out.println("Area of the created room is "+area);
				
		
	}

}
