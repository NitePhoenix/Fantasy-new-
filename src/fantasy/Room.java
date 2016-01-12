package fantasy;

import java.util.ArrayList;

public class Room {
	String name;
	int gold;
	boolean radioactive;
	
	ArrayList<Character> characters;
	
	Room(String name, int gold, boolean radioactive)
	{
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
