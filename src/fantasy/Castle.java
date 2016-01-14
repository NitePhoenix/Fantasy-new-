package fantasy;

import java.util.ArrayList;

/**
 * This class regulates rooms
 * @author S. Camilleri
 * Modified by Leo Hon and Susan Chen
 */

class Castle {
	ArrayList<Room> rooms;
	
	Castle(){
		rooms = new ArrayList<Room>();
	}
	
	/**
	 * Adds a Room to the Castle level
	 * @param room (the Room)
	 */
	void addRoom(Room room){
		rooms.add(room);
	}
	
	/**
	 * Occurs when a Character enters Room
	 * @param character (the Character)
	 * @param room (the Room)
	 */
	void enterRoom(Character character, Room room){
		System.out.println(character.getName() + " enters the " + room.getName() + ".");
		room.enter(character);
	}
	
	/**
	 * Occurs when a Character leaves a Room
	 * @param character (the Character)
	 * @param room (the Room)
	 */
	void exitRoom(Character character, Room room){
		room.exit(character);
		
		System.out.println(character.getName() + " leaves the " + room.getName() + ".");
		System.out.println();
	}
	
	/**
	 * Returns the number of Rooms
	 * @return The number of Rooms
	 */
	int getRoomCount(){
		return rooms.size();
	}
	
	/**
	 * Returns a Room according to index
	 * @param index
	 * @return 
	 */
	Room getRoom(int index){
		return rooms.get(index);
	}

}