package fantasy;

/**
 * This class represents the sole character of the game.
 * Modified by Leo Hon
 *
 */
class Wizard extends CharacterInheritance{
//	String name;
//	int health;
	int gold;
	final static int maxGold = 20;
	
	Wizard(String name)
	{
		this.name = name;
		health = 100;
		gold = 0;
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
		
		System.out.println(getName() + " takes " + taken + " gold. Gold=" + gold + " bars");
		
		return available - taken;
	}
	
//	/**
//	 * Drinking potion restores health.
//	 */
//	void drinkPotion()
//	{
//		health = (int)(health * 2.0);
//		
//		System.out.println(getName() + " drinks potion. Health=" + health + "%");
//	}
//	
//	/**
//	 * Reduce the health by 10%.
//	 */
//	void exposeToRadiation()
//	{
//		health = (int)(health * 0.9);
//		
//		System.out.println(getName() + " is exposed to radiation. Health=" + health + "%");
//	}
	
	/**
	 * A description of this Elf.
	 * @return
	 */
	String getName() {
		return "Wizard " + name;
	}
}
