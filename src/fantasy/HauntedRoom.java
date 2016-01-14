package fantasy;

import java.util.ArrayList;

/**
 * HauntedRooms have certain properties that Characters can interact with
 * Modified by Leo Hon
 */

class HauntedRoom extends Room {
	private boolean ghosts;
	ArrayList<Character> characters;
	
	/**
	 * Constructs a HauntedRoom
	 * @param name (the name of the room)
	 * @param gold (the amount of the gold)
	 * @param radioactive (if radioactivity is present)
	 * @param ghosts (if ghosts are present)
	 */
	HauntedRoom(String name, int gold, boolean radioactive, boolean ghosts){
		super(name, gold, radioactive);
		this.ghosts = ghosts;
		characters = new ArrayList<Character>();
	}
	
	/**
	 * Overrides method in Room in case of ghost encounter
	 * @param character (the Character)
	 */
	public void enter(Character character){
		if (radioactive)
			character.exposeToRadiation();
		
		gold = character.takeGold(gold);
		
		if (ghosts){
			character.findGhost();
		}
	}

}