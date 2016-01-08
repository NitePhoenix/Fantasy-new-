//Chen, Susan
package fantasy;

public class CharacterInheritance {
	String name;
	int health;
	
	/**
	 * Drinking potion restores health.
	 */
	void drinkPotion(Elf elf){		
		health = 100;
		System.out.println(getName() + " drinks potion. Health = " + health + "%");
	}
	void drinkPotion(Ogre Ogre){		
		health = health+0;
		System.out.println(getName() + " drinks potion. Health = " + health + "%");
	}
	void drinkPotion(Wizard wizard){		
		health = health*2;
		System.out.println(getName() + " drinks potion. Health = " + health + "%");
	}
	
	/**
	 * Reduce the health by x%.
	 */
	void exposeToRadiation(Elf elf){
		health = (int)(health * 0.9);
		System.out.println(getName() + " is exposed to radiation. Health = " + health + "%");
	}
	void exposeToRadiation(Ogre ogre){
		health = (int)(health * 0.95);
		System.out.println(getName() + " is exposed to radiation. Health = " + health + "%");
	}
	void exposeToRadiation(Wizard wizard){
		health = (int)(health * 0.75);
		System.out.println(getName() + " is exposed to radiation. Health = " + health + "%");
	}
	
	/**
	 * The name of the character.
	 * @return
	 */
	String getName(){
		return name;
	}

}
