import java.util.Random;
public class CursedArmor extends Items implements CursedItems
{
	// Each execution gives it a random % of amplified damage //
	Random armor = new Random();
	int R = armor.nextInt(10);
	int CursedArmor = R;
	public CursedArmor(String itemName, int protection) 
	{
		super(itemName);
	}

	// Curse method //
	public void curse() 
	{
		System.out.println("You have unknowningly equipped " + this.itemName + " has amplified damage by " + R + "%!");
		
	}

	public void breaker() 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void itemOkay() 
	{
		// TODO Auto-generated method stub
		
	}

	
	

}
