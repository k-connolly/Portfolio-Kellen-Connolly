
public class Ship {
	String name;
	String type;
	int strength;
	
	public Ship(String name) {	//ship's Name 
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String shipType) {  //ship's Type
		type = shipType;
	}
	
	public String getType() {
		return type;
	}
	
	public void setStrength (int shipStrength) { //Ship's Strength 
		strength = shipStrength;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void printShip() {
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Strength: " + strength);
	}
	//Repairs Ship to 100
	public void Repair() {
		if (strength < 100) {
			strength = 100;
		System.out.println(type + " " + name + " has been repaired to full strength");
		}
		else {
			System.out.println("Ship already at full strength.");
		}
		System.out.println();
	}
	
}

