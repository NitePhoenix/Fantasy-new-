package fantasy;

/**
 * This class is inherited by different types of characters
 * Modified by Leo Hon and Susan Chen
 */

public class Character {
	String name;
	int health;
	int gold;
	
	/**
	 * Drinking potion restores health
	 */
	void drinkPotion(){	
	}
	
	/**
	 * Reduce the health by x%
	 */
	void exposeToRadiation(){
	}
	
	/**
	 * Encountering a ghost
	 */
	void findGhost(){
	}
	
	/**
	 * Takes an amount of gold
	 * @param available (the amount of gold available to be taken)
	 */
	int takeGold(int available){
	}
	
	/**
	 * The name of the character
	 * @return name
	 */
	String getName(){
		return name;
	}

}
