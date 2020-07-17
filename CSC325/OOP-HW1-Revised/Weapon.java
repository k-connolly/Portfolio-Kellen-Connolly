
public class Weapon extends GameItems
{
	//Variable for Weapon items//
	protected double Damage;
	
	//Method that sets the additional parameter for the damage the item does//
	public Weapon(String ParaItemName, String ParaAttribute, double ParaDamage) 
	{
		super(ParaItemName, ParaAttribute);
		this.Damage = ParaDamage;
		
	}
	
	//Setter//
	public void setDamage(double ParaDamage)
	{
		this.Damage = ParaDamage;
	}
	
	//Getter - returns the value//
	public double getDamage()
	{
		return Damage;
	}
	
	//String representation of the item being used//
	public String toString()
	{
		String result = super.toString();
		result += "Damage Points: " + Damage + "\n";
		result += "----------------------------------";
		return result;
	}
	
	// "You now wield 'weapon'" , "You do 'x' damage" //
	void use()
	{
		super.use();
		System.out.println("Equipped! You will now deal " + Damage + " per hit!");
	}

	

}
