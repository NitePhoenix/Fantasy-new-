package fantasy;
import java.util.ArrayList;

/**
 * Modified by Leo Hon
 */
class MagicRoom extends Room{
	boolean potion;
	
	ArrayList<Character> characters;
	/**
	 * Constructs a MagicRoom
	 * @param name The name of the room.
	 * @param gold The amount of the gold.
	 * @param radioactive If radioactivity is present
	 * @param potion If potion is present
	 */
	MagicRoom(String name, int gold, boolean radioactive, boolean potion)
	{
		super(name, gold, radioactive);
		this.potion = potion;
		characters = new ArrayList<Character>();
	}
	
	void enter(Character character){
		
		if (radioactive)
			character.exposeToRadiation();
		gold = character.takeGold(gold);
		if (potion)
		{
			character.drinkPotion();
		}
	}
//	void exit(Character character){
//		characters.remove(character);
//	}
}