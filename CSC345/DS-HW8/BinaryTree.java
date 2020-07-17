import java.util.ArrayList;
import java.util.Random;
@SuppressWarnings("unused")
public class BinaryTree 
{
	private Node currentNode = new Node("");
	private Node root = new Node("");
	//private Node previousNode; // not an actual node
	
	//Constructor
	public BinaryTree(String data)
	{
		root = new Node(data);//"A"
		currentNode = root;
		//System.out.println("Creating Binary Tree. CurrentNode is Root. The currentNode has a value of " + currentNode.getData() + ".");
	}
	
	//Add node to left
	public void addLeft(Node l)
	{
		//Calling setter
		currentNode.setLeft(l);
		currentNode.getLeft().setPrev(currentNode); //set the previous node to the current node
		//System.out.println("Adding node to the left with value " + l.getData() + ".");
	}
	
	//Add node to right
	public void addRight(Node r)
	{
		//Calling setter
		currentNode.setRight(r);
		currentNode.getRight().setPrev(currentNode);//set the previous node to the current node
		//System.out.println("Adding node to the right with value " + r.getData() + ".");
	}
	
	//Moving to the left node
	public void moveLeft()
	{
		currentNode = currentNode.getLeft();
		//System.out.println("Moving Left, currentNode is " + currentNode.getData() + ".");
	}
	
	//Moving to the right node
	public void moveRight()
	{
		currentNode = currentNode.getRight();
		//System.out.println("Moving Right, currentNode is " + currentNode.getData() + ".");
	}
	
	public void moveBack()
	{
		currentNode = currentNode.getPrev();
		//System.out.println("Moving back to previous node, currentNode is " + currentNode.getData() + ".");
	}
	
	public void BECKTOTHEROOT()
	{
		currentNode = root;
	}
	
	public Node getCurrentNode()
	{
		return currentNode;
	}
	
	public void setCurrentNode(Node n)
	{
		currentNode = n;
	}
	
}
