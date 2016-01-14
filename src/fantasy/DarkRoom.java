package fantasy;

import java.util.ArrayList;

/**
 * DarkRooms have certain properties that Characters can interact with
 * @author S. Camilleri
 * Modified by Leo Hon
 */

class DarkRoom extends Room {
	ArrayList<Character> characters;
	
	/**
	 * Constructs a DarkRoom
	 * @param name (the name of the room)
	 * @param gold (the amount of the gold)
	 * @param radioactive (if radioactivity is present)
	 */
	DarkRoom(String name, int gold, boolean radioactive){
		super(name, gold, radioactive);
		characters = new ArrayList<Character>();
	}

}