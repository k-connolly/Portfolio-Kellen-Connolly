
public class Food extends Items 
{
	//Variable for setter and getter for the items//
		protected int healthRestored;
		protected int healthReduced;
		public Food(String itemName, int healthRestored, int healthReduced)
		{
			super(itemName);
			this.healthRestored = healthRestored;
			this.healthReduced = healthReduced;
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
			System.out.println("You eat " + itemName + " and restore " + healthRestored + " HP!");
			
		}
}
