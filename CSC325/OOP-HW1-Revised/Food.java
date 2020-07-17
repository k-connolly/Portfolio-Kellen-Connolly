
public class Food extends GameItems
{
	//Variable for the Food items//
	protected double HealthRestore;
	
	//Method that sets the additional parameter for restoring health//
	public Food(String ParaItemName, String ParaAttribute, double ParaHealthRestore)
	{
		super(ParaItemName, ParaAttribute);
		this.HealthRestore = ParaHealthRestore;
	}
	
	//Setter//
	public void setHealthRestore(double ParaHealthRestore)
	{
		this.HealthRestore = ParaHealthRestore;
	}
	
	//Getter - return value//
	public double getHealthRestore()
	{
		return HealthRestore;
	}
	
	//String representation of the item being used//
	public String toString()
	{
		String result = super.toString();
		result += "HP Restore: " + HealthRestore + "\n";
		result += "----------------------------------";
		return result;
	}
	
	// "You eat 'name' item", "You restore 'x' health" //
	void use()
	{
		super.use();
		System.out.println("Consumed! You restored " + HealthRestore + " HP!");
	}
}
