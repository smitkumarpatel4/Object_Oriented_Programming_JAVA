package Static_data_Room;

public class RoomApp {

	public static void main(String[] args) {
		
		Room kitchen = new Room();
		Room bathroom = new Room();
		Room bedroom = new Room();
		
		
		bedroom.showStatus();  //
		
		kitchen.turnOn();
		bathroom.showStatus();
		
		bedroom.invertStatus();
		bathroom.showStatus();
		
	}

}
