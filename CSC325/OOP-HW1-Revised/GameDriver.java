
public class GameDriver 
{
	//This Class executes all the code that is in all the subclasses//
		public static void main(String[] args) 
		{
		
			//Creating the instance of an Array//
			GameItems[] InventoryItem;
				
				//Creating an Array with 6 slots, each item is set in that position of the array//
				//The parameters of the items in the array are the Item's name, Attribute, and action//
				InventoryItem = new GameItems[6];
				InventoryItem[0] = new Weapon("Imperial Sword", "Blade Extension", 50);
				InventoryItem[1] = new Weapon("Jabber Lance", "Dual Blade", 80);
				InventoryItem[2] = new Food("Yeet Soup", "Yeeting Health Up", 25);
				InventoryItem[3] = new Food("Low Sodium Coke", "Tasteless", 15);
				InventoryItem[4] = new Armor("Iron Breastplate", "Medium Chest Protection", 10);
				InventoryItem[5] = new Armor("Bronze Helmet", "SlightHead Protection", 20);
				
				
				System.out.println("-------------INVENTORY------------"); //Title for output
				System.out.println(" ");//Space
				
				//The loop for the array that displays each item//
				for (int i = 0; i < InventoryItem.length; i++)
				{
					System.out.println(InventoryItem[i]);
					System.out.println(" ");//Space
					System.out.println(" ");//Space
				}
				
				
				System.out.println("--------ITEM HISTORY---------"); //Title for output
				System.out.println(" "); //Space
				
				//2nd loop the calls each 'use' method from the subclasses and prints out there action//
				for(GameItems x : InventoryItem)
				{
					System.out.println("----------------------------------");//Line to seperate the actions
					x.use();
					System.out.println("----------------------------------");//Line to seperate the actions
					System.out.println(" ");//Space
				}
			
			
		}
		

			
		

}
