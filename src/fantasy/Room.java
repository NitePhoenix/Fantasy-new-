package fantasy;

import java.util.ArrayList;

/**
 * This class is inherited by different types of rooms
 * Modified by Leo Hon
 */

public class Room {
	protected String name;
	protected int gold;
	protected boolean radioactive;
	ArrayList<Character> characters;
	
	/**
	 * Constructs a Room
	 * @param character (the Character)
	 * @param gold (the amount of gold)
	 * @param radioactive (if radioactivity is present)
	 */
	Room(String name, int gold, boolean radioactive){
		this.name = name;
		this.gold = gold;
		this.radioactive = radioactive;
		characters = new ArrayList<Character>();
	}
	
	/**
	 * Methods that are called when a character enters a room
	 * @param character (the Character)
	 */
	public void enter(Character character){
		characters.add(character);
		
		if (radioactive)
			character.exposeToRadiation();
		
		gold = character.takeGold(gold);
	}
	
	/**
	 *Methods that are run when a character exits a room
	 * @param character (the Character)
	 */
	public void exit(Character character){
		characters.remove(character);
	}
	
	/**
	 * The name of the room
	 * @return name
	 */
	public String getName(){
		return name;
	}

}