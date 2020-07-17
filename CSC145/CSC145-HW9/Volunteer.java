// Shows a staff member that works as a volunteer //
public class Volunteer extends StaffMember
{
	// Method that sets up Volunteers information //
	public Volunteer(String eTitle, String eName, String eAddress, String ePhone)
	{
		super(eTitle, eName, eAddress, ePhone);
	}
	
	// Volunteers get a zero payment method //
	public double pay()
	{
		return 0.0;
	}
}
