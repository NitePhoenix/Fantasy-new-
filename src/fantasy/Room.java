package fantasy;

import java.util.ArrayList;

public class Room {
	String name;
	int gold;
	boolean radioactive;
	
	ArrayList<Elf> elves;
	ArrayList<Ogre> ogres;
	ArrayList<Wizard> wizards;
	
	Room(String name, int gold, boolean radioactive)
	{
		this.name = name;
		this.gold = gold;
		this.radioactive = radioactive;
		
		elves = new ArrayList<Elf>();
		ogres = new ArrayList<Ogre>();
		wizards = new ArrayList<Wizard>();
	}
	
	void enter(Elf elf){
		elves.add(elf);
		
		if (radioactive)
			elf.exposeToRadiation(elf);
		
		gold = elf.takeGold(gold);
	}
	void exit(Elf elf){
		elves.remove(elf);
	}
	
	void enter(Ogre ogre)
	{
		ogres.add(ogre);
		
		if (radioactive)
			ogre.exposeToRadiation(ogre);
		
		gold = ogre.takeGold(gold);
	}
	void exit(Ogre ogre){
		elves.remove(ogre);
	}
	
	void enter(Wizard wizard)
	{
		wizards.add(wizard);
		
		if (radioactive)
			wizard.exposeToRadiation(wizard);
		
		gold = wizard.takeGold(gold);
	}
	void exit(Wizard wizard){
		elves.remove(wizard);
	}
	
	String getName(){
		return name;
	}
	
	int getNumOfGold()
	{
		return gold;
	}
}
