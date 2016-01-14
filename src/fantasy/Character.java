package fantasy;

/**
 * This class is inherited by different types of characters
 * Modified by Susan Chen
 */

public class Character {
	protected String name;
	protected int health;
	protected int gold;
	
	/**
	 * Drinking potion restores health
	 */
	public void drinkPotion(){	
	}
	
	/**
	 * Reduce the health by x%
	 */
	public void exposeToRadiation(){
	}
	
	/**
	 * Encountering a ghost
	 */
	public void findGhost(){
	}
	
	/**
	 * Takes an amount of gold
	 * @param available (the amount of gold available to be taken)
	 */
	public int takeGold(int available){
		return available;
	}
	
	/**
	 * The name of the character
	 * @return name
	 */
	public String getName(){
		return name;
	}

}