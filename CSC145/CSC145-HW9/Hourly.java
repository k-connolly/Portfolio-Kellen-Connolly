// Shows an employees information that gets paid hourly //
public class Hourly extends Employee
{
	// Declared Variables //
	private int hoursWorked;
	
	// Hourly specified information //
	public Hourly(String eTitle, String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eTitle, eName, eAddress, ePhone, socSecNumber, rate);
		
		hoursWorked = 0;
	}
	
	// Method that adds hours //
	public void addHours(int moreHours)
	{
		hoursWorked += moreHours;
	}
	
	// Method calculates and returns value of payment for hours //
	public double pay()
	{
		double payment = payRate * hoursWorked;
		
		hoursWorked = 0;
		
		return payment;
	}
	
	// Returns textual information about hourly //
	public String toString()
	{
		String result = super.toString();
		
		result += "\nCurrent hours: " + hoursWorked;
		//count--; //this line of code did not need to be implemented
		
		return result;
	}
}
