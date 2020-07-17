
public class Armor extends Items 
{
	//Variable for setter and getter for the items//
		protected int protection;
		public Armor(String itemName, int protection)
		{
			super(itemName);
			this.protection = protection;
		}
		
		//Setter
		public void setProtection(int protection)
		{
			this.protection = protection;
		}
		
		//Getter//
		public int getProtection()
		{
			return protection;
		}
		
		//The use method that the driver calls in the for loop//
		void use()
		{
			super.use();
			System.out.println("This item decreases damage by " + this.protection + " percent.");
		}
}
