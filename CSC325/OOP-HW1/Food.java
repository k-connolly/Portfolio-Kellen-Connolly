
public class Food extends Items
{
	//Variable for setter and getter for the items//
	protected int healthRestored;
	public Food(String itemName, int healthRestored)
	{
		super(itemName);
		this.healthRestored = healthRestored;
	}
	
	//Setter//
	public void setHealthRestored(int healthRestored)
	{
		this.healthRestored = healthRestored;
	}
	
	//Getter to return the value//
	public int getHealthRestored()
	{
		return healthRestored;
	}
	
	//The use method that the driver calls in the for loop//
	void use()
	{
		super.use();
		System.out.println("You eat " + this.itemName + " and restore " + this.healthRestored + " HP.");
	}
}
