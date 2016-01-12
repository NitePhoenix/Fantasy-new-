package fantasy;

import java.util.ArrayList;

/**
 * This class is inherited by different types of rooms
 * Modified by Leo Hon and Susan Chen
 */

public class Room {
	String name;
	int gold;
	boolean radioactive;
	ArrayList<Character> characters;
	
	Room(String name, int gold, boolean radioactive){
		this.name = name;
		this.gold = gold;
		this.radioactive = radioactive;
		characters = new ArrayList<Character>();
	}
	
	void enter(Character character){
		characters.add(character);
		
		if (radioactive)
			character.exposeToRadiation();
		
		gold = character.takeGold(gold);
	}
	
	void exit(Character character){
		characters.remove(character);
	}
	
	String getName(){
		return name;
	}

}
