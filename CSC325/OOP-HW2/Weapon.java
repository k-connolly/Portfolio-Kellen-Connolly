
public class Weapon extends Items 
{
	// Variable for setter and getter for the items //
		protected int damage;
		public Weapon(String itemName, int damage)
		{
			super(itemName);
			this.damage = damage;
		}
		
		//Setter//
		public void setDamage(int damage)
		{
			this.damage = damage;
		}
		
		//Getter to return the value//
		public int getDamage()
		{
			return damage;
		}
		
		//The use method that the driver calls in the for loop//
		void use()
		{
			super.use();
			System.out.println("Weapon does " + this.damage + " points of damage on each hit.");
		}
}
