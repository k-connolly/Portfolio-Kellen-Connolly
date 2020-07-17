
public class Fleet_Driver 
{
	// Declaring String Values for Fleet_Driver class //
	private  String fleetname;
	private  String commandername;
	private String commanderRank;
	
	// These are the setters and getters for setting the values on Fleet_Main //
	// Main variable setters for Fleet_Driver //
	public Fleet_Driver(String name, String cname, String crank) 
	{
		fleetname = name;
		commandername = cname;
		commanderRank = crank;
	}
	
	// FleetName Variable (Getter) //
	public String getFleetName() 
	{
		return fleetname;
	}

	//fleetname variable (Setter) //
	public void setfleetname(String name) 
	{
		fleetname = name;
	}

	// CommanderName variable (Getter) //
	public String getCommanderName() 
	{
		return commandername;
	}

	// commandername variable (Setter) //
	public void setcommandername(String cname) 
	{
		commandername = cname;
	}

	// CommanderRank Variable (Getter) //
	public String getCommanderRank() 
	{
		return commanderRank;
	}

	// commanderrank Variable (Setter) //
	public void setcommanderrank(String crank) 
	{
		commanderRank = crank;
	}
	
	
}
