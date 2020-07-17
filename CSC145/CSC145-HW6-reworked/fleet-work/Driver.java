
public class Driver {
public static void main(String[] args) {
		//list of ships
		Ship shipOne = new Ship("Unpredictable");
		Ship shipTwo = new Ship("Popeye");
		Ship shipThree = new Ship("Numbskull");
		Ship shipFour = new Ship("Underdog");
		Ship shipFive = new Ship("Insufferable");
		Ship shipSix = new Ship("Wisconsin");
		Ship shipSeven = new Ship("Maine");
		Ship shipEight = new Ship("Radiant");
		// sets the class of the ship and strength
		shipOne.setType("Frigate");
		shipOne.setStrength(47);
		shipTwo.setType("Destroyer");
		shipTwo.setStrength(50);
		shipThree.setType("Corvette");
		shipThree.setStrength(60);
		shipFour.setType("Corvette");
		shipFour.setStrength(93);
		shipFive.setType("Cruiser");
		shipFive.setStrength(100);
		shipSix.setType("Destroyer");
		shipSix.setStrength(86);
		shipSeven.setType("Dreadnought");
		shipSeven.setStrength(29);
		shipEight.setType("Corvette");
		shipEight.setStrength(67);
		//gives leaders
		Leader commanderOne = new Leader("Jennifer Long");
		Leader commanderTwo = new Leader("Jack Cannon");
		//sets rank and exp of commanders
		commanderOne.setRank("Vice Admiral");
		commanderOne.setXP(100);
		commanderTwo.setRank("Fleet Admiral");
		commanderTwo.setXP(20);
		
		Fleet fleetOne = new Fleet("First Fleet");
		Fleet fleetTwo = new Fleet("Reserve Fleet");
		
		fleetOne.addShip(shipOne);
		fleetOne.addShip(shipTwo);
		fleetOne.addShip(shipThree);
		fleetOne.addShip(shipFour);
		fleetTwo.addShip(shipFive);
		fleetTwo.addShip(shipSix);
		fleetTwo.addShip(shipSeven);
		fleetTwo.addShip(shipEight);
		
		fleetOne.fleetCommand(fleetOne, commanderOne);
		fleetTwo.fleetCommand(fleetTwo, commanderTwo);
		
		fleetOne.toString();
		fleetTwo.toString();
		
		shipOne.Repair();
		
		commanderOne.Promote();
	
	}
}


