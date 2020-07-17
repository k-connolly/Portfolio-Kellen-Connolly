
public class Dog 
{
	// Declarations //
	private String Name;
	private int Age;
	
	// Setting Method Parameters //
	public Dog (String name, int age)
	{
		Name = name;
		Age = age;
	}
	
	// Setters/Getters //
//---------------------------------------------//
	public String getNAME()
	{
		return Name;
	}
	
	public int getAGE()
	{
		return Age;
	}
	
	// Method to 'Calculate' Human Years //
	public int getHumanYears()
	{
		return getAGE() * 7;
	}
//---------------------------------------------//
	
	// toString Method //
	public String toString()
	{
		return "The name of the dog is " + getNAME() 
			+ "\nThe dog's age in person Years is " + getHumanYears();
	}
	
}
