import java.util.ArrayList;
public class Game_Driver 
{

	public static void main(String[] args) 
	{
		// ArrayList to create Items and there descriptions //
		ArrayList<Items> Inventory = new ArrayList<Items>();
			Items Noodles = new Food("Slippy Noods", 10);
			Items Hamburger = new Food("Phat Borger", 25);
			Items Lance = new Weapon("Yeet Stick", 500);
			Items Axe = new Weapon("Big oof cutter", 700);
			Items Chestplate = new Armor("Chest Beater", 30);
			Items Helmet = new Armor("Head Protector", 15);
			
				// Adding items to ArrayList //
				Inventory.add(0, Noodles);
				Inventory.add(1, Hamburger);
				Inventory.add(2, Lance);
				Inventory.add(3, Axe);
				Inventory.add(4, Chestplate);
				Inventory.add(5, Helmet);
			
		//This is to make the output more understandable//
		System.out.println("ITEM HISTORY: ");
		System.out.println("-------------------------------------------------");
		// Printing out what player uses from the ArrayList //
		for (Items x : Inventory)
		{
			x.use();
			System.out.println(" "); // Space for readability
		}
	}
}
