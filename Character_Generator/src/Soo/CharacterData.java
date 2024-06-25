package Soo;

import java.util.Random;

public class CharacterData {
	private int age;
	private String name;
	private String race;
	private String Gender;
	private String Background;
	private String occupation;
	private String characterClass;
	private String weapon;
	private String traits;
	private String affinity;
	
	public CharacterData() {};
	
	public CharacterData(int age, String name, String race, String gender, String background, String occupation,
			String characterClass, String weapon, String traits, String affinity) {
		super();
		this.age = age;
		this.name = name;
		this.race = race;
		Gender = gender;
		Background = background;
		this.occupation = occupation;
		this.characterClass = characterClass;
		this.weapon = weapon;
		this.traits = traits;
		this.affinity = affinity;
	}

	public void randomizeAge(int minAge, int maxAge) {
		if(minAge < 0 || maxAge < 0 || minAge > maxAge) {
			throw new IllegalArgumentException("Invalid age range");
		}
		Random rand = new Random();
		this.age = rand.nextInt((maxAge - minAge)+1)+minAge;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBackground() {
		return Background;
	}

	public void setBackground(String background) {
		Background = background;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getTraits() {
		return traits;
	}

	public void setTraits(String traits) {
		this.traits = traits;
	}

	public String getAffinity() {
		return affinity;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
