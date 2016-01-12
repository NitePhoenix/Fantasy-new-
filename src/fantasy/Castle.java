package fantasy;

import java.util.ArrayList;

class Castle {

	ArrayList<Room> rooms;
	
	Castle()
	{
		rooms = new ArrayList<Room>();
	}
	
	/**
	 * Adds a DarkRoom, HauntedRoom, or MagicRoom to the Castle level.
	 * @param DkRoom.
	 * @param HdRoom.
	 * @param McRoom.
	 */
	void addRoom(Room room)
	{
		rooms.add(room);
	}
	
	/**
	 * Occurs when an Elf enters a DarkRoom, HauntedRoom, or MagicRoom
	 * @param elf The Elf.
	 * @param darkroom The DarkRoom, hauntedroom The HauntedRoom, and magicroom The MagicRoom.
	 */
	void enterRoom(Character character, Room room)
	{
		System.out.println(character.getName() + " enters the " + room.getName() );
		room.enter(character);
		
	}
	
	/**
	 * Occurs when an Elf leaves a DarkRoom, HauntedRoom, or MagicRoom.
	 * @param elf The Elf.
	 * @param darkroom The DarkRoom, hauntedroom The HauntedRoom, and magicroom The MagicRoom.
	 */
	void exitRoom(Character character, Room room)
	{
		room.exit(character);
		
		System.out.println(character.getName() + " leaves the " + room.getName() );
		System.out.println();
	}
	
	/**
	 * Returns the number of DarkRooms, HauntedRooms, and MagicRooms.
	 * @return The number of DarkRooms, HauntedRooms, or MagicRooms.
	 */

	int getRoomCount()
	{
		return rooms.size();
	}
	
	/**
	 * Returns a DarkRoom, HauntedRoom, and MagicRoom according to index.
	 * @param index
	 * @return
	 */
	Room getRoom(int index) {
		return rooms.get(index);
	}
}
