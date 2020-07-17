import java.util.ArrayList;

public class Fleet_Main 
{

	public static void main(String[] args) 
	{
		// Creating the fleets as objects //
		Fleet_Driver Fleet1 = new Fleet_Driver("Fleet", "Commander", "Rank");
		Fleet_Driver Fleet2 = new Fleet_Driver("Fleet", "Commander", "Rank");
	
		// Setting String values //
		String FleetName;
		String CommanderName;
		String CommanderRank;
		String CommanderRank2;
		
		// Fleet Name for 1st fleet //
		FleetName = "1st Regiment Fleet";
			Fleet1.setfleetname(FleetName);
			Fleet1.getFleetName();
		System.out.println(FleetName);
			
		// Commander's Name for 1st Fleet //
		CommanderName = "Denis Baker";
			Fleet1.setcommandername(CommanderName);
			Fleet1.getCommanderName();
		
		// Commander's Rank and promoted Rank declared and set //
		CommanderRank = "Rear Admiral";
		CommanderRank2 = "Vice Admiral";
			Fleet1.setcommanderrank(CommanderRank);
			Fleet1.getCommanderRank();
		System.out.println("Led by " + CommanderRank + " " + CommanderName);
		System.out.println("Ships:");
		
		// Setting 1st fleets ships health values //
		int strength1 = 45;
		int strength2 = 65;
		int strength3 = 78;
		int strength4 = 34;
		int strength5 = 100;
		
		// Array for 1st Fleet ships //
	ArrayList<String> ships1 = new ArrayList<String>();
		ships1.add("Aggressor, Battleship" + ", " + strength1 +"/100");
		ships1.add("Commonwealth, Aircraft Carrier" + ", " + strength2 + "/100");
		ships1.add("Nox, Destroyer" + ", " + strength3 + "/100");
		ships1.add("Ossory, Cruiser" + ", " + strength4 + "/100");
		ships1.add("Mariner, Cruiser" + ", " + strength5 + "/100");
		
		// Loop to print ships on individual line //
		int s1 = 0;
		for (String ARRAYSHIPS : ships1)
		{
			if (s1 < ships1.size()-1)
			{
				System.out.println(ARRAYSHIPS + " ");
				System.out.println(" ");
			}
			else
			{
				System.out.print(ARRAYSHIPS);
				System.out.println(" ");
			}
			
			s1++;
		}
		System.out.println(" ");
		System.out.println("Mariner has been repaired!");
		System.out.println(" ");
		System.out.println(CommanderName + " has been promoted to " + CommanderRank2 + "!");
		
		// Spacer //
		System.out.println(" ");
		
		// 2nd Fleet Name //
		FleetName = "2nd Regiment Fleet";
			Fleet2.setfleetname(FleetName);
			Fleet2.getFleetName();
		System.out.println(FleetName);
			
		// 2nd Fleet Commander //
		CommanderName = "Charles Watson";
			Fleet2.setcommandername(CommanderName);
			Fleet2.getCommanderName();
		
		// 2nd Fleet Commander's Rank //
		CommanderRank = "Vice Admiral";
			Fleet2.setcommanderrank(CommanderRank);
			Fleet2.getCommanderRank();
		System.out.println("Led by " + CommanderRank + " " + CommanderName);
		System.out.println("Ships:");
		
		// Setting 2nd Fleets ship health value //
		int Strength1 = 100;
		int Strength2 = 86;
		int Strength3 = 54;
		int Strength4 = 96;
		int Strength5 = 23;
		
		// Array for 2nd Fleet ships //
	ArrayList<String> ships2 = new ArrayList<String>();
		ships2.add("Amphitrite, Battleship" + ", " + Strength1 +"/100");
		ships2.add("Yukon, Battleship" + ", " + Strength2 + "/100");
		ships2.add("Elysium, Aircraft Carrier" + ", " + Strength3 + "/100");
		ships2.add("Churchill, Corvette" + ", " + Strength4 + "/100");
		ships2.add("Falcon, Cruiser" + ", " + Strength5 + "/100");
		
		// Loop to print ships on individual line //
		int s2 = 0;
		for (String ARRAYSHIPS2 : ships2)
		{
			if (s2 < ships2.size()-1)
			{
				System.out.println(ARRAYSHIPS2 + " ");
				System.out.println(" ");
			}
			else
			{
				System.out.print(ARRAYSHIPS2);
				System.out.println(" ");
			}
			s2++;
		}
		
		
	}
	
}
