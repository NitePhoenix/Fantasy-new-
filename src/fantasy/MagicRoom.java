package fantasy;

import java.util.ArrayList;

/**
 * MagicRooms have certain properties that Characters can interact with
 * Modified by Leo Hon
 */

class MagicRoom extends Room {
	boolean potion;
	ArrayList<Character> characters;
	
	/**
	 * Constructs a MagicRoom
	 * @param name (the name of the room)
	 * @param gold (the amount of the gold)
	 * @param radioactive (if radioactivity is present)
	 * @param potion (if a potion is present)
	 */
	MagicRoom(String name, int gold, boolean radioactive, boolean potion){
		super(name, gold, radioactive);
		this.potion = potion;
		characters = new ArrayList<Character>();
	}
	
	void enter(Character character){
		if (radioactive)
			character.exposeToRadiation();
		
		gold = character.takeGold(gold);
		
		if (potion){
			character.drinkPotion();
		}
	}

}