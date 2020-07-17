public class GameItems
{
	//Variable for the basics of the items
	protected String ItemName;
	protected String Attribute;
	
	//Method setting the parameter variables//
	public GameItems(String ParaItemName, String ParaAttribute) 
	{
		this.ItemName = ParaItemName;
		this.Attribute = ParaAttribute;
	}
	
	//Setter//
	public void setGameItemsNames(String ParaItemName, String ParaAttribute)
	{
		this.ItemName = ParaItemName;
		this.Attribute = ParaAttribute;
	}
	
	//Getter - returns the value//
	public String GetItemNames()
	{
		return ItemName;
	}
	
	//Getter - returns the value//
	public String GetAttribute()
	{
		return Attribute;
	}

	//Method to 'use' item that prints the Item's Name//
	void use()
	{
		System.out.println(ItemName);
	}

	//String representation of the Item's basic Characteristics//
	public String toString()
	{
		String result = "Item Name: " +  ItemName +"\n";
		result += "----------------------------------\n";
		result += "Attribute: " + Attribute + "\n";
		return result;
	}
	
}
