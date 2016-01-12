package fantasy;

/**
 * This class represents the sole character of the game.
 * Modified by Leo Hon
 *
 */
class Ogre extends Character{
	final static int maxGold = 0;
	
	Ogre(String name)
	{
		this.name = name;
		health = 100;
		gold = 0;
	}
	
	void drinkPotion(){		
		health = health+0;
		System.out.println(getName() + " drinks potion. Health = " + health + "%");
	}
	
	void exposeToRadiation(){
		health = (int)(health * 0.95);
		System.out.println(getName() + " is exposed to radiation. Health = " + health + "%");
	}
	/**
	 * Takes the maximum amount of gold and returns the leftover amount.
	 * @param available The amount of gold available to be taken.
	 * @return The amount of gold leftover.
	 */
	int takeGold(int available)
	{
		int taken = 0;
		if (available + gold <= maxGold)
		{
			gold += available;
			taken = available;
		}
		else
		{
			gold = maxGold;
			taken = available - maxGold;
		}
		
		System.out.println(getName() + " takes " + gold + " gold. Gold=" + gold + " bars");
		
		return taken;
	}
	
	void findGhost()
	{
		System.out.println(getName() + " encounters ghosts. Gold=" + gold + " bars");
	}
	
	/**
	 * A description of this ogre.
	 * @return
	 */
	String getName() {
		return "Ogre " + name;
	}
}
