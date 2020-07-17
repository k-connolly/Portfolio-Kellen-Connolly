import java.util.ArrayList;
public class Fleet {

	 String name;
	 String  fleetName;
	 String commander;
	 String commanderRank;
	 String ship;
	 String shipType;
	 int shipStrength;
	 Ship fleetShip;
	 Leader lead;
	 
	 public Fleet(String name) {
		 this.name = name;
	 }
	 public String getName() {
		return name;
	}

	 public void setCommander(Leader commander) {
		 lead = commander;
		 this.commander =  lead.getName();
	 }
	 
	 public String getCommander() {
		 return commander;
	 }
	 
	public ArrayList<Ship> shipList = new ArrayList<Ship>();
	 
	 public void addShip (Ship ship) {
		 fleetShip = ship;
		 shipList.add(fleetShip);
	}

	public void fleetCommand(Fleet fleet, Leader commander) {
		this.name = fleet.getName();
		this.commander = commander.getName();
		this.commanderRank = commander.getRank();
	}

	 public String toString() {
		 System.out.println(name + "\n");
		 System.out.println("Led by " + commanderRank + " " + commander + "\n");
		 for (int i = 0; i <shipList.size(); i++) {
			fleetShip = shipList.get(i);
			ship = fleetShip.getName();
			shipType = fleetShip.getType();
			shipStrength = fleetShip.getStrength();
			System.out.println(shipType + ", " + ship +": " + shipStrength + "/100");
			System.out.println();
		 }
			return commander;
		
	}

}
