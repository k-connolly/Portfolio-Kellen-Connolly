
public class Node 
{
	private Node left = null;
	private Node right = null;
	private Node prev = null;
	private String data;
	
	//Constructor for node
	public Node(String data) //initialize next and data
	{
		this.data = data;
	}
	
	//Setters and Getters
	public String getData()
	{
		return data;
	}
	
	public void setData(String data) 
	{
		this.data = data;
	}
	
	public Node getLeft() 
	{
		return left;
	}
	
	public void setLeft(Node left) 
	{
		this.left = left;
	}
	
	public Node getRight() 
	{
		return right;
	}
	
	public void setRight(Node right) 
	{
		this.right = right;
	}
	
	//New getter and setter for Previous node//
	public Node getPrev()
	{
		return prev;
	}
	
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
}
