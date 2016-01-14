package fantasy;

/**
 * This class is responsible for constructing levels and coordinating interaction of Characters with Rooms
 * @author S. Camilleri
 * Modified by Leo Hon and Susan Chen
 */

public class Game {

	/**
	 * Initiates the start of game play
	 */
	void play(){
		Castle castle = new Castle();
		createLevel1(castle);
		createLevel2(castle);
		createLevel3(castle);
		
		Elf elf = new Elf("Sam");
		Ogre ogre = new Ogre("Pat");
		Wizard wizard = new Wizard("Draco");
		
		for (int i=0; i<castle.getRoomCount(); i++){
			Room room = castle.getRoom(i);
			castle.enterRoom(elf, room);
			castle.exitRoom(elf, room);
			castle.enterRoom(ogre, room);
			castle.exitRoom(ogre, room);
			castle.enterRoom(wizard, room);
			castle.exitRoom(wizard, room);
		}
	}

	/**
	 * Constructs 3 levels of the game, with a number of rooms, for the characters
	 * @param castle
	 */
	void createLevel1(Castle castle){
		DarkRoom darkroom = new DarkRoom("foyer", 50, true);
		castle.addRoom(darkroom);
		
		darkroom = new DarkRoom("kitchen", 100, false);
		castle.addRoom(darkroom);
		
		darkroom = new DarkRoom("living room", 90, true);
		castle.addRoom(darkroom);
	}
	
	void createLevel2(Castle castle){
		HauntedRoom hauntedroom = new HauntedRoom("dungeon", 150, true, true);
		castle.addRoom(hauntedroom);
		
		hauntedroom = new HauntedRoom("garage", 250, false, false);
		castle.addRoom(hauntedroom);
		
		hauntedroom = new HauntedRoom("storage closet", 500, true, true);
		castle.addRoom(hauntedroom);
    }
	
	void createLevel3(Castle castle){
		MagicRoom magicroom = new MagicRoom("bedroom", 75, true, true);
		castle.addRoom(magicroom);
		
		magicroom = new MagicRoom("bathroom", 125, false, false);
		castle.addRoom(magicroom);
	}

}