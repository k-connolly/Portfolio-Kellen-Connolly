// Shows the general information for paid employee //
public class Employee extends StaffMember
{
	protected String socialSecurityNumber;
	protected double payRate;
	
	// Method that deals with specified information such as SSN and Pay Rate //
	public Employee(String eTitle, String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eTitle, eName, eAddress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		
		payRate = rate;
	}
	
	// Returns string information about SSN //
	public String toString()
	{
		String result = super.toString();
		result += "\nSSN: " + socialSecurityNumber;
		
		return result;
	}
	
	// Returns pay rate for employees that are paid //
	public double pay()
	{
		return payRate;
	}
}
