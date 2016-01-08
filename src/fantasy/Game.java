package fantasy;

/**
 * This class is responsible for constructing levels and coordinating interaction of
 * Elves with Darkrooms.
 * Modified by Leo Hon
 *
 */
public class Game {

	/**
	 * Initiates the start of game play.
	 */
	void play() {
		Castle castle = new Castle();
		createLevel1(castle);
		createLevel2(castle);
		createLevel3(castle);
		
		Elf elf = new Elf("Sam");
		Ogre ogre = new Ogre("Pat");
		Wizard wizard = new Wizard("Draco");
		
		for (int i=0; i<castle.getDarkRoomCount(); i++)
		{
			DarkRoom darkroom = castle.getDarkRoom(i);
			castle.enterRoom(elf, darkroom);
			castle.exitRoom(elf, darkroom);
			castle.enterRoom(ogre, darkroom);
			castle.exitRoom(ogre, darkroom);
			castle.enterRoom(wizard, darkroom);
			castle.exitRoom(wizard, darkroom);
		}
		
		for (int i=0; i<castle.getHauntedRoomCount(); i++)
		{
			HauntedRoom hauntedroom = castle.getHauntedRoom(i);
			castle.enterRoom(elf, hauntedroom);
			castle.exitRoom(elf, hauntedroom);
			castle.enterRoom(ogre, hauntedroom);
			castle.exitRoom(ogre, hauntedroom);
			castle.enterRoom(wizard, hauntedroom);
			castle.exitRoom(wizard, hauntedroom);
		}
		
		for (int i=0; i<castle.getMagicRoomCount(); i++)
		{
			MagicRoom magicroom = castle.getMagicRoom(i);
			castle.enterRoom(elf, magicroom);
			castle.exitRoom(elf, magicroom);
			castle.enterRoom(ogre, magicroom);
			castle.exitRoom(ogre, magicroom);
			castle.enterRoom(wizard, magicroom);
			castle.exitRoom(wizard, magicroom);
			
		}
	}

	/**
	 * Constructs 3 levels of the game for the characters.
	 * @param castle
	 */
	void createLevel1(Castle castle)
	{
		DarkRoom darkroom = new DarkRoom("foyer", 50, true);
		castle.addRoom(darkroom);
		
		darkroom = new DarkRoom("kitchen", 100, false);
		castle.addRoom(darkroom);
		
		darkroom = new DarkRoom("living room", 0, true);
		castle.addRoom(darkroom);
	}
	
	void createLevel2(Castle castle)
    {
		HauntedRoom hauntedroom = new HauntedRoom("dungeon", 150, true, true);
		castle.addRoom(hauntedroom);
		
		hauntedroom = new HauntedRoom("garage", 25, false, false);
		castle.addRoom(hauntedroom);
		
		hauntedroom = new HauntedRoom("storage closet", 500, true, true);
		castle.addRoom(hauntedroom);
    }
	
	void createLevel3(Castle castle)
	{
		MagicRoom magicroom = new MagicRoom("bedroom", 75, true, true);
		castle.addRoom(magicroom);
		
		magicroom = new MagicRoom("bathroom", 25, false, false);
		castle.addRoom(magicroom);
	}
}
