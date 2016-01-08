package fantasy;

import java.util.ArrayList;

class Castle {
	ArrayList<DarkRoom> darkroom;
	ArrayList<HauntedRoom> hauntedroom;
	ArrayList<MagicRoom> magicroom;
	
	Castle()
	{
		darkroom = new ArrayList<DarkRoom>();
		hauntedroom = new ArrayList<HauntedRoom>();
		magicroom = new ArrayList<MagicRoom>();
	}
	
	/**
	 * Adds a DarkRoom, HauntedRoom, or MagicRoom to the Castle level.
	 * @param DkRoom.
	 * @param HdRoom.
	 * @param McRoom.
	 */
	void addRoom(DarkRoom DkRoom)
	{
		darkroom.add(DkRoom);
	}
	void addRoom(HauntedRoom HdRoom)
	{
		hauntedroom.add(HdRoom);
	}
	void addRoom(MagicRoom McRoom)
	{
		magicroom.add(McRoom);
	}
	
	/**
	 * Occurs when an Elf enters a DarkRoom, HauntedRoom, or MagicRoom
	 * @param elf The Elf.
	 * @param darkroom The DarkRoom, hauntedroom The HauntedRoom, and magicroom The MagicRoom.
	 */
	void enterRoom(Elf elf, DarkRoom darkroom)
	{
		darkroom.enter(elf);
		
		System.out.println(elf.getName() + " enters the " + darkroom.getName() );
	}
	void enterRoom(Elf elf, HauntedRoom hauntedroom)
	{
		hauntedroom.enter(elf);
		
		System.out.println(elf.getName() + " enters the " + hauntedroom.getName() );
	}
	void enterRoom(Elf elf, MagicRoom magicroom)
	{
		magicroom.enter(elf);
		
		System.out.println(elf.getName() + " enters the " + magicroom.getName() );
	}
	
	void enterRoom(Ogre ogre, DarkRoom darkroom)
	{
		darkroom.enter(ogre);
		
		System.out.println(ogre.getName() + " enters the " + darkroom.getName() );
	}
	void enterRoom(Ogre ogre, HauntedRoom hauntedroom)
	{
		hauntedroom.enter(ogre);
		
		System.out.println(ogre.getName() + " enters the " + hauntedroom.getName() );
	}
	void enterRoom(Ogre ogre, MagicRoom magicroom)
	{
		magicroom.enter(ogre);
		
		System.out.println(ogre.getName() + " enters the " + magicroom.getName() );
	}
	
	void enterRoom(Wizard wizard, DarkRoom darkroom)
	{
		darkroom.enter(wizard);
		
		System.out.println(wizard.getName() + " enters the " + darkroom.getName() );
	}
	void enterRoom(Wizard wizard, HauntedRoom hauntedroom)
	{
		hauntedroom.enter(wizard);
		
		System.out.println(wizard.getName() + " enters the " + hauntedroom.getName() );
	}
	void enterRoom(Wizard wizard, MagicRoom magicroom)
	{
		magicroom.enter(wizard);
		
		System.out.println(wizard.getName() + " enters the " + magicroom.getName() );
	}
	
	/**
	 * Occurs when an Elf leaves a DarkRoom, HauntedRoom, or MagicRoom.
	 * @param elf The Elf.
	 * @param darkroom The DarkRoom, hauntedroom The HauntedRoom, and magicroom The MagicRoom.
	 */
	void exitRoom(Elf elf, DarkRoom darkroom)
	{
		darkroom.exit(elf);
		
		System.out.println(elf.getName() + " leaves the " + darkroom.getName() );
		System.out.println();
	}
	void exitRoom(Elf elf, HauntedRoom hauntedroom)
	{
		hauntedroom.exit(elf);
		
		System.out.println(elf.getName() + " leaves the " + hauntedroom.getName() );
		System.out.println();
	}
	void exitRoom(Elf elf, MagicRoom magicroom)
	{
		magicroom.exit(elf);
		
		System.out.println(elf.getName() + " leaves the " + magicroom.getName() );
		System.out.println();
	}
	
	void exitRoom(Ogre ogre, DarkRoom darkroom)
	{
		darkroom.exit(ogre);
		
		System.out.println(ogre.getName() + " leaves the " + darkroom.getName() );
		System.out.println();
	}
	void exitRoom(Ogre ogre, HauntedRoom hauntedroom)
	{
		hauntedroom.exit(ogre);
		
		System.out.println(ogre.getName() + " leaves the " + hauntedroom.getName() );
		System.out.println();
	}
	void exitRoom(Ogre ogre, MagicRoom magicroom)
	{
		magicroom.exit(ogre);
		
		System.out.println(ogre.getName() + " leaves the " + magicroom.getName() );
		System.out.println();
	}
	
	void exitRoom(Wizard wizard, DarkRoom darkroom)
	{
		darkroom.exit(wizard);
		
		System.out.println(wizard.getName() + " leaves the " + darkroom.getName() );
		System.out.println();
	}
	void exitRoom(Wizard wizard, HauntedRoom hauntedroom)
	{
		hauntedroom.exit(wizard);
		
		System.out.println(wizard.getName() + " leaves the " + hauntedroom.getName() );
		System.out.println();
	}
	void exitRoom(Wizard wizard, MagicRoom magicroom)
	{
		magicroom.exit(wizard);
		
		System.out.println(wizard.getName() + " leaves the " + magicroom.getName() );
		System.out.println();
	}
	
	/**
	 * Returns the number of DarkRooms, HauntedRooms, and MagicRooms.
	 * @return The number of DarkRooms, HauntedRooms, or MagicRooms.
	 */
	int getDarkRoomCount()
	{
		return darkroom.size();
	}
	int getHauntedRoomCount()
	{
		return hauntedroom.size();
	}
	int getMagicRoomCount()
	{
		return magicroom.size();
	}
	
	/**
	 * Returns a DarkRoom, HauntedRoom, and MagicRoom according to index.
	 * @param index
	 * @return
	 */
	DarkRoom getDarkRoom(int index) {
		return darkroom.get(index);
	}
	HauntedRoom getHauntedRoom(int index) {
		return hauntedroom.get(index);
	}
	MagicRoom getMagicRoom(int index) {
		return magicroom.get(index);
	}
}
