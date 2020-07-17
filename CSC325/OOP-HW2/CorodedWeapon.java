import java.util.Random;
public class CorodedWeapon extends Items implements CursedItems 
{

	public CorodedWeapon(String itemName, int damage) 
	{
		super(itemName);
	}

	// curse method // absolutely at random
	@Override
	public void curse() 
	{
		Random rand = new Random();
		int n = rand.nextInt(10)+3;
		if(n<3)
		{
			super.curse();
		}
		else if (n == 3)
		{
			breaker();
		}
		else
		{
			itemOkay();
		}
			
	}

	// Return statement if item == 3 //
	public void breaker() 
	{
		System.out.println(this.itemName + " has coroded/broken and deals no damage!");
	}

	// If item does not == 3 then it prints a 'hit' statement //
	public void itemOkay() 
	{
		System.out.println(this.itemName + " landed a hit!");
	}

}
