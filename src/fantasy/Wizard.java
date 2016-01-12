package fantasy;

/**
 * This class represents one character of the game
 * Modified by Leo Hon and Susan Chen
 */

class Wizard extends Character {
	final static int maxGold = 20;
	
	/**
	 * Constructs a Wizard
	 * @param name (the name of the wizard)
	 */
	Wizard(String name){
		this.name = name;
		health = 100;
		gold = 0;
	}
	
	/**
	 * Drinking potion restores health
	 */
	void drinkPotion(){		
		health = health*2;
		System.out.println(getName() + " drinks potion. Health = " + health + "%");
	}
	
	/**
	 * Reduce the health by x%
	 */
	void exposeToRadiation(){
		health = (int)(health * 0.75);
		System.out.println(getName() + " is exposed to radiation. Health = " + health + "%");
	}
	
	/**
	 * Takes the maximum amount of gold and returns the leftover amount
	 * @param available (the amount of gold available to be taken)
	 * @return the amount of gold leftover
	 */
	int takeGold(int available){
		int taken = 0;
		if (available + gold <= maxGold){
			gold += available;
			taken = available;
		}
		else{
			gold = maxGold;
			taken = available - maxGold;
		}
		
		System.out.println(getName() + " takes " + gold + " gold. Gold=" + gold + " bars");	
		return taken;
	}
	
	/**
	 * Ghost encounter has no effect
	 */
	void findGhost(){
		System.out.println(getName() + " encounters ghosts. Gold=" + gold + " bars");
	}
	
	/**
	 * A description of this wizard
	 * @return
	 */
	String getName() {
		return "Wizard " + name;
	}

}
