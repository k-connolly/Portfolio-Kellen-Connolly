// Shows an executive members information with an added bonus //
public class Executive extends Employee
{
	private double bonus;
	
	// Setting up executives special information //
	public Executive(String eTitle, String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eTitle, eName, eAddress, ePhone, socSecNumber, rate);
		
		bonus = 0; //bonus not yet awarded here
	}
	
	// Method sets bonus to executive //
	public void awardBonus(double execBonus)
	{
		bonus = execBonus;
	}
	
	// Method calculates the payment and gives a bonus //
	public double pay()
	{
		double payment = super.pay() + bonus;
		
		bonus = 0;
			
		return payment;
	}
	
	public String toString()
	{
		String result = super.toString();
		
		result += "\nA Bonus has been added! "
				+ "\nThe amount was: " + bonus;
		//count--; //this line of code did not need to be implemented
		
		return result;
	}
	
	
}
