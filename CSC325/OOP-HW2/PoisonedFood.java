
public class PoisonedFood extends Food implements CursedItems
{
	protected int healthReduced;
	public PoisonedFood(String itemName, int healthReduced)
	{
		super(itemName, healthReduced, healthReduced);
		this.healthReduced = healthReduced;
	}
	
	// Curse Method //
	public void curse() 
	{
		System.out.println("You have unknowningly equipped " + this.itemName + ", it reduces health by " + this.healthReduced);
	}

	
	public void breaker() {
		// TODO Auto-generated method stub
		
	}

	
	public void itemOkay() {
		// TODO Auto-generated method stub
		
	}
	

}
