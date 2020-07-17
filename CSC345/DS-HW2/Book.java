
public class Book 
{
	//Variables//
	private String Title;
	private String Author;
	private String Category;
	
	//Setting the parameters of the variables//
	public Book(String bookName, String bookAuthor, String bookCategory) 
	{
		this.Title = bookName;
		this.Author = bookAuthor;
		this.Category = bookCategory;
	}

	//Getter for the string category
	public String getCategory() 
	{
		return Category;
	}

	//toString method//
	public String toString()
	{
		return this.Title + " by " + this.Author + ". Category: " + this.Category;
	}
	/*
	public toString 
	{
		String result = "Book in stack: ";
		result += "----------------------------------";
		result += Title + " by " + Author + ", Category: " + Category;
		return result;
	}
	*/
	
	
}
