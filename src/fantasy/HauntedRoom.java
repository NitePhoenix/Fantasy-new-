package fantasy;
import java.util.ArrayList;

/**
 * Modified by Leo Hon
 */

class HauntedRoom extends Room{
	boolean ghosts;
	
	ArrayList<Character> characters;
	
	/**
	 * Constructs a HauntedRoom
	 * @param name The name of the room.
	 * @param gold The amount of the gold.
	 * @param radioactive If radioactivity is present
	 * @param ghosts If ghosts are present
	 */
	HauntedRoom(String name, int gold, boolean radioactive, boolean ghosts)
	{
		super(name, gold, radioactive);
		this.ghosts = ghosts;
		characters = new ArrayList<Character>();
	}
	
	void enter(Character character){
		
		if (radioactive)
			character.exposeToRadiation();
		gold = character.takeGold(gold);
		if (ghosts)
		{
			character.findGhost();
		}
	}
}