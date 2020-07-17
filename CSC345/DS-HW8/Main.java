import java.util.LinkedList;
import java.util.Queue;

public class Main 
{
	static BinaryTree objectTree = new BinaryTree("A");
	
	public static void main(String[] args)
	{
			//-----TREE STRUCTURE------//
		
			objectTree.addLeft(new Node("B"));
			objectTree.addRight(new Node("C"));
			objectTree.moveLeft();
			objectTree.addLeft(new Node("D"));
			objectTree.addRight(new Node("E"));
			objectTree.moveBack();
			objectTree.moveRight();
			objectTree.addLeft(new Node("F"));
			objectTree.addRight(new Node("G"));
			objectTree.moveBack();
			objectTree.moveLeft();
			objectTree.moveLeft();
			objectTree.addLeft(new Node("H"));
			objectTree.addRight(new Node("I"));
			objectTree.moveBack();
			objectTree.moveRight();
			objectTree.addLeft(new Node("J"));
			objectTree.addRight(new Node("K"));
			objectTree.moveBack();
			objectTree.moveBack();
			objectTree.moveRight();
			objectTree.moveLeft();
			objectTree.addLeft(new Node("L"));
			objectTree.addRight(new Node("M"));
			objectTree.moveBack();
			objectTree.moveRight();
			objectTree.addLeft(new Node("N"));
			objectTree.addRight(new Node("O"));
			
			
		//------TRAVERSALS------//
		
		System.out.println("----PreOrder----");
		objectTree.BECKTOTHEROOT();
		PreOrderTraversal(objectTree.getCurrentNode());
		
		System.out.println("----InOrder----");
		objectTree.BECKTOTHEROOT();
		InorderTraversal(objectTree.getCurrentNode());
		
		System.out.println("----PostOrder----");
		objectTree.BECKTOTHEROOT();
		PostorderTraversal(objectTree.getCurrentNode());
		
		System.out.println("----LevelOrder----");
		objectTree.BECKTOTHEROOT();
		LevelOrderTraversal(objectTree.getCurrentNode());
	}
	
	//Preorder Traversal of the tree//
	private static Node PreOrderTraversal(Node n)
	{
		System.out.println(objectTree.getCurrentNode().getData());
		
		if (objectTree.getCurrentNode().getLeft() != null)
		{
			objectTree.moveLeft();
			n = PreOrderTraversal(objectTree.getCurrentNode());
		}
		
		if (objectTree.getCurrentNode().getRight() != null)
		{
			objectTree.moveRight();
			n = PreOrderTraversal(objectTree.getCurrentNode());
		}
		
		if (!(objectTree.getCurrentNode().getData().equals("A")))
		{
			objectTree.moveBack();
		}
		
		return objectTree.getCurrentNode();
	}
	
	//Inorder traversal of the tree//
	private static Node InorderTraversal(Node n)
	{
		
		if (objectTree.getCurrentNode().getLeft() != null)
		{
			objectTree.moveLeft();
			n = PreOrderTraversal(objectTree.getCurrentNode());
		}
		
		System.out.println(objectTree.getCurrentNode().getData());
		
		if (objectTree.getCurrentNode().getRight() != null)
		{
			objectTree.moveRight();
			n = PreOrderTraversal(objectTree.getCurrentNode());
		}
		
		if (!(objectTree.getCurrentNode().getData().equals("A")))
		{
			objectTree.moveBack();
		}
		
		return objectTree.getCurrentNode();
	}
	
	//Postorder traversal of tree//
	private static Node PostorderTraversal(Node n)
	{
		
		if (objectTree.getCurrentNode().getLeft() != null)
		{
			objectTree.moveLeft();
			n = PreOrderTraversal(objectTree.getCurrentNode());
		}
		
		if (objectTree.getCurrentNode().getRight() != null)
		{
			objectTree.moveRight();
			n = PreOrderTraversal(objectTree.getCurrentNode());
		}
		
		System.out.println(objectTree.getCurrentNode().getData());
		
		if (!(objectTree.getCurrentNode().getData().equals("A")))
		{
			objectTree.moveBack();
		}
		
		return objectTree.getCurrentNode();
	}
	
	//LevelOrder traversal of the tree//
	private static void LevelOrderTraversal(Node n)
	{
		//Implementing a queue with a linkedlist//
		Queue<Node> nodeQueue = new LinkedList<Node>();
		
		nodeQueue.add(objectTree.getCurrentNode());
		
		while (nodeQueue.size() != 0)
		{
			System.out.println(objectTree.getCurrentNode().getData());
			
			if (objectTree.getCurrentNode().getLeft() != null)
			{
				nodeQueue.add(objectTree.getCurrentNode().getLeft());
			}
			
			if (objectTree.getCurrentNode().getRight() != null)
			{
				nodeQueue.add(objectTree.getCurrentNode().getRight());
			}
			
			nodeQueue.remove();
			objectTree.setCurrentNode(nodeQueue.peek());
		}
	}
	
}
