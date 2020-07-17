
public class Main 
{
   
	public static void main(String[] args) 
	{
		// Creating a binary tree object //
		BinaryTree objectTree = new BinaryTree();
		System.out.println("-----Creating Int Binary Tree-----");
		System.out.println(); //Spacer
		objectTree.insertData(43);
		objectTree.insertData(11);
		objectTree.insertData(64);
		objectTree.insertData(32);
		objectTree.insertData(28);
		objectTree.insertData(23);
		objectTree.insertData(16);
		objectTree.insertData(10);
		objectTree.insertData(3);
		objectTree.insertData(8);
		objectTree.insertData(13);
		
		System.out.println(); //Spacer
        System.out.println("-------------------");
        System.out.println("Traversing the tree");
        
        objectTree.inOrderTraversal();
        System.out.println(); //Spacer
        objectTree.delete(64);
        System.out.println(); //Spacer
        
        objectTree.inOrderTraversal();
        System.out.println(); //Spacer
        objectTree.delete(16);
        System.out.println(); //Spacer
        
        objectTree.inOrderTraversal();
        System.out.println(); //Spacer
        objectTree.delete(8);
        System.out.println(); //Spacer
        
        objectTree.inOrderTraversal();
        System.out.println(); //Spacer
        objectTree.delete(23);
        System.out.println(); //Spacer
        
        // Final Product//
        System.out.println("-----RESULTS-----");
        objectTree.inOrderTraversal();
	}
	
}
