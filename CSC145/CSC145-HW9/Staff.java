// This creates the list of employees and stores their info from the firm //
public class Staff 
{
	private StaffMember[] staffList;
	
	public Staff()
	{
		// List that has members information //
		// Job title, Name, Address, Phone number, Social Security Number, and Pay Rate //
		// Volunteers, however, are excluded from SSN, and do not have a Pay Rate //
		staffList = new StaffMember[8];
		staffList[0] = new Executive("Executive", "James Usry", "3353 Horizon Circle", "253-677-4205", "534-84-1743", 2523.97);
		staffList[1] = new Employee("Employee", "Ryan Hamilton", "852 Nuzum Court", "716-565-5476", "094-94-4701", 1486.25);
		staffList[2] = new Employee("Employee", "Patricia Williams", "3371 Briarhill Lane", "330-281-8689", "280-01-5913", 1299.03);
		staffList[3] = new Employee("Employee", "Edward Carwile", "1396 Cardinal Lane", "217-226-6019", "333-01-8346", 1397.47);
		staffList[4] = new Employee("Employee", "Jon Karst", "2012 Pinnick Street", "732-849-9858", "146-28-0931", 1087.86);
		staffList[5] = new Hourly("Hourly", "Fonda Shull", "3812 Coal Street", "814-332-0808", "159-64-1165", 10.55);
		staffList[6] = new Volunteer("Volunteer", "Norma Maynard", "1807 Brannon Street", "213-299-5725");
		staffList[7] = new Volunteer("Volunteer", "Donald Potts", "3149 Walnut Street", "601-653-1335");
		
		((Executive)staffList[0]).awardBonus(500.00); // $500 award bonus for executive
		
		((Hourly)staffList[5]).addHours(40); // 40 hours for Hourly worker
	}
	
	// Method that pays staff //
	public void payday()
	{
		double amount;
			
			// For Loop that prints out information of firm employees //
			for (int count = 0; count < staffList.length; count++)
			{
				System.out.println(staffList[count]);
				
				amount = staffList[count].pay(); //Polymorphic
				
				if (amount == 0.0)
					System.out.println("Thanks for Volunteering!");
				else
					System.out.println("Paid: " + amount);
				
				System.out.println("----------------------------------");
				System.out.println(" "); // Adds a space for each persons bracket, just for organization
			}
	}
}
