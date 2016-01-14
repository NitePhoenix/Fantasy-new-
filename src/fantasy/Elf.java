package fantasy;

/**
 * This class represents one character of the game
 * @author S. Camilleri
 * Modified by Susan Chen
 */

class Elf extends Character {
	private final static int maxGold = 8;
	
	/**
	 * Constructs an Elf
	 * @param name (the name of the elf)
	 */
	Elf(String name){
		this.name = name;
		health = 100;
		gold = 0;
	}
	
	/**
	 * Drinking potion restores health
	 */
	public void drinkPotion(){		
		health = 100;
		System.out.println(getName() + " drinks potion.\n" +
				"\tHealth restored.\n" +
				"\tHealth = " + health + "%.");
	}
	
	/**
	 * Reduce the health by x%
	 */
	public void exposeToRadiation(){
		health = (int)(health * 0.9);
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
		else {
			gold = maxGold;
			taken = available - maxGold;
		}
		
		System.out.println(getName() + " takes " + gold + " gold.\n" +
				"\tGold = " + gold + " bars.");
		return taken;
	}
	
	/**
	 * Ghost encounter loses all gold
	 */
	public void findGhost(){
		gold = 0;
		
		System.out.println(getName() + " encounters ghosts.\n" +
				"\t" + getName() + " is scared! All gold dropped.\n" +
				"\tGold = " + gold + " bars.");
	}

	/**
	 * A description of this Elf
	 * @return
	 */
	public String getName(){
		return "Elf " + name;
	}

}