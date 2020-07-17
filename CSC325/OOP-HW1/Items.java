
public class Items 
{
	// Variable for setter and getter for the items //
	protected String itemName;
	public Items(String itemName)
	{
		this.itemName = itemName;
	}
	
	//Setter//
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	//Getter to return//
	public String getItemName()
	{
		return itemName;
	}
	
	//The use method that the driver calls in the for loop//
	void use()
	{
		System.out.println("Item used '" + itemName + "'!");
	}
}
