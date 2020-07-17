abstract public class StaffMember 
{
	// Declared Variables //
	protected String jobtitle;
	protected String name;
	protected String address;
	protected String phone;
	
	// Method that sets up employees information //
	public StaffMember(String eTitle, String eName, String eAddress, String ePhone)
	{
		jobtitle = eTitle;
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	// Returns a toString representation of the basic employee information //
	public String toString()
	{
		String result = "Job Title: " + jobtitle + "\n";
		result += "----------------------------------\n";
		result += "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		
		return result;
	}
	
	// Pay Method defining each type for employee //
	public abstract double pay();
}
