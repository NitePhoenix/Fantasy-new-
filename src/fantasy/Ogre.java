package fantasy;

/**
 * This class represents one character of the game
 * Modified by Susan Chen
 */

class Ogre extends Character {
	private final static int maxGold = 0;
	
	/**
	 * Constructs an Ogre
	 * @param name (the name of the ogre)
	 */
	Ogre(String name){
		this.name = name;
		health = 100;
		gold = 0;
	}
	
	/**
	 * Drinking potion does not restore any health
	 */
	public void drinkPotion(){		
		health = health+0;
		System.out.println(getName() + " drinks potion.\n" +
				"\tHealth restored.\n" +
				"\tHealth = " + health + "%.");
	}
	
	/**
	 * Reduce the health by x%
	 */
	public void exposeToRadiation(){
		health = (int)(health * 0.95);
		System.out.println(getName() + " is exposed to radiation.\n" +
				"\tHealth lost.\n" +
				"\tHealth = " + health + "%.");
	}
	
	/**
	 * Takes the maximum amount of gold and returns the leftover amount
	 * @param available (the amount of gold available to be taken)
	 * @return the amount of gold leftover
	 */
	public int takeGold(int available){
		int taken = 0;
		if (available + gold <= maxGold){
			gold += available;
			taken = available;
		}
		else{
			gold = maxGold;
			taken = available - maxGold;
		}
		
		System.out.println(getName() + " takes " + gold + " gold.\n" +
				"\t" + getName() + " does not know what gold is.\n" +
				"\tGold = " + gold + " bars.");
		return taken;
	}
	
	/**
	 * Ghost encounter has no effect
	 */
	public void findGhost(){
		System.out.println(getName() + " encounters ghosts.\n" +
				"\t" + getName() + " is not affected by ghosts.\n" +
				"\tGold = " + gold + " bars.");
	}
	
	/**
	 * A description of this ogre
	 * @return
	 */
	public String getName() {
		return "Ogre " + name;
	}

}