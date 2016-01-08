package fantasy;
import java.util.ArrayList;

/**
 * Modified by Leo Hon
 */
class MagicRoom extends Room{
	boolean potion;
	
	ArrayList<Elf> elves;
	
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
	}
	
	void enter(Elf elf)
	{
		super.enter(elf);
		if (potion)
		{
			elf.drinkPotion(elf);
		}
	}
}