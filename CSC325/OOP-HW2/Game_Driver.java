import java.util.Random;
import java.util.ArrayList;
public class Game_Driver 
{
	static Random num = new Random();
	static int num1 = num.nextInt(100);
	public static void main(String[] args) 
	{
		// ArrayList to create Items and there descriptions //
				ArrayList<Items> Inventory = new ArrayList<Items>();
					Items Noodles = new Food("Slippy Noods", 10 , 0);
					Items Hamburger = new Food("Phat Borger", 25, 0);
					Items Lance = new Weapon("Yeet Stick", 500);
					Items Axe = new Weapon("Big oof cutter", 700);
					Items Chestplate = new Armor("Chest Beater", 30);
					Items Helmet = new Armor("Head Protector", 15);
				
					// Cursed Examples for array //
					Items SickApple = new PoisonedFood("Cursed Apple", num1);
					Items CrookedBlade = new CorodedWeapon("Cursed Blade", 0);
					Items IronBoots = new CursedArmor("Cursed Boots", 0); //Items
					
						// Adding items to ArrayList //
						Inventory.add(0, Noodles);
						Inventory.add(1, Hamburger);
						Inventory.add(2, Lance);
						Inventory.add(3, Axe);
						Inventory.add(4, Chestplate);
						Inventory.add(5, Helmet);
						
						// adding examples to array //
						Inventory.add(6, SickApple);
						Inventory.add(7, CrookedBlade);
						Inventory.add(8, IronBoots);
						
				//This is to make the output more understandable//
				System.out.println("ITEM HISTORY: ");
				System.out.println("-------------------------------------------------");
				// Printing out what player uses from the ArrayList //
				for (Items x : Inventory)
				{
					
					x.use(); //calling the use method
					
					System.out.println(" "); // Space for readability
				}
				
				// Call statements //
				SickApple.curse(); //calling the curse method 
				IronBoots.curse(); //calling the curse method 
				
				// Printing out the randomness of the coroded weapon, whether it breaks or not //
				System.out.println(" ");
				System.out.println("History of used coroded weapon:");
				System.out.println("-------------------------------------------------");
				for (int i = 0; i < 10; i++)
				{
					CrookedBlade.curse();
				}

	}

}
