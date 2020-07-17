
public class Armor extends GameItems
{
	//Variable for Armor items//
	protected double Protection;
	
	//Method that sets the additional parameter for armor protection//
	public Armor(String ParaItemName, String ParaAttribute, double ParaProtection) 
	{
		super(ParaItemName, ParaAttribute);
		this.Protection = ParaProtection;
	}
	
	//Setter//
	public void setProtection(double ParaProtection)
	{
		this.Protection = ParaProtection;
	}
	
	//Getter - returns the value//
	public double getProtection()
	{
		return Protection;
	}
	
	//String representation of the item being used//
	public String toString()
	{
		String result = super.toString();
		result += "Protection: " + Protection + "%\n";
		result += "----------------------------------";
		return result;
	}
	
	// "You equipped 'name' item", "Damage has been reduced by 'x' %" //
	void use()
	{
		super.use();
		System.out.println("Equipped! You now are protected from " + Protection + "% of damage!");
	}
	
	
}
