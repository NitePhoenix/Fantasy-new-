package fantasy;

import java.util.ArrayList;

/**
 * DarkRooms have certain properties that Elves can interact with.
 * Modified by Leo Hon
 *
 */
class DarkRoom extends Room{
	
	ArrayList<Elf> elves;
	
	/**
	 * Constructs a DarkRoom
	 * @param name The name of the room.
	 * @param gold The amount of the gold.
	 * @param radioactive If radioactivity is present
	 */
	DarkRoom(String name, int gold, boolean radioactive)
	{
		super(name, gold, radioactive);
	}
}