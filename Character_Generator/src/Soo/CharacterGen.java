package Soo;

public class CharacterGen {

	public static void main(String[] args) {
		System.out.println("Gnight Tokki, Love you :)");
		CharacterData npc1 = new CharacterData();
		npc1.randomizeAge(18, 95);
		System.out.println(npc1.getAge());
		
        CharacterData npc2 = new CharacterData(25, "Aragorn", "Human", "Male", "Noble", "Ranger", 
                "Fighter", "Sword", "Brave", "Light");
		System.out.println("NPC2 Name: " + npc2.getName());
		System.out.println("NPC2 Age: " + npc2.getAge());
		System.out.println("NPC2 Race: " + npc2.getRace());
		
        CharacterData npc3 = new CharacterData();
        npc3.setName("Gimli");
        npc3.setRace("Dwarf");
        npc3.setWeapon("Axe");
        System.out.println("NPC3 Name: " + npc3.getName());
        System.out.println("NPC3 Race: " + npc3.getRace());
        System.out.println("NPC3 Weapon: " + npc3.getWeapon());
	}

}
