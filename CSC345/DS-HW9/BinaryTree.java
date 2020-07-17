
public class BinaryTree
{
	private Node root;
	
	/*
	 public boolean isEmpty() 
	 {
	   	return(this.root == null);
	 }
	 */
	 
	    public Node getRoot() 
	    {
	        return root;
	    }
	 
	    public void insertData(Integer data) {
	 
	        System.out.print("--inserting: "+data+"--\n");
	        if(root == null) 
	        {
	            this.root = new Node(data);
	            System.out.println(" -> inserted: "+data);
	            return;
	        }
	 
	        insertNode(this.root, data);
	        System.out.print(" -> inserted: "+data);
	        System.out.println();
	    }
	 
	    private Node insertNode(Node root, Integer data) 
	    {
	        Node placeHolder = null;
	        System.out.print(" ->"+root.getData());
	        if(root.getData() >= data) 
	        {
	            System.out.print(" added to the left!");
	            if(root.getLeft() == null) 
	            {
	                root.setLeft(new Node(data));
	                return root.getLeft();
	            } 
	            else 
	            {
	                placeHolder = root.getLeft();
	            }
	        } 
	        else 
	        {
	            System.out.print(" added to the right!");
	            if(root.getRight() == null) 
	            {
	                root.setRight(new Node(data));
	                return root.getRight();
	            } 
	            else 
	            {
	                placeHolder = root.getRight();
	            }
	        }
	 
	        return insertNode(placeHolder, data);
	    }
	 
	    public void delete(Integer data) 
	    {
	 
	        deleteNode(this.root, data);
	    }
	 
	    private Node deleteNode(Node root, Integer data) 
	    {
	 
	        if(root == null) return root;
	 
	        if(data < root.getData()) 
	        {
	            root.setLeft(deleteNode(root.getLeft(), data));
	        } 
	        else if(data > root.getData()) 
	        {
	            root.setRight(deleteNode(root.getRight(), data));
	        } 
	        else 
	        {
	            // node with no child nodes //
	            if(root.getLeft() == null && root.getRight() == null) 
	            {
	                System.out.println("deleting " + data);
	                return null;
	            } 
	            
	        	// node with one child node (but no left node) //
	            else if(root.getLeft() == null) 
	            {
	                
	                System.out.println("deleting " + data);
	                return root.getRight(); 
	            } 
	            
	            // node with one child node (but no right node) //
	            else if(root.getRight() == null) 
	            {
	               
	                System.out.println("deleting " + data );
	                return root.getLeft();
	            } 
	            
	            // node with 2 child nodes //
	            // we look for the minimum number in the right side of the tree //
	            else 
	            {
	                Integer minValue = minValue(root.getRight());
	                root.setData(minValue);
	                root.setRight(deleteNode(root.getRight(), minValue));
	                System.out.println("deleting " + data);
	            }
	        }
	 
	        return root;
	    }
	 
	    // Use a wrapper class for integers //
	    private Integer minValue(Node node) 
	    {
	 
	        if(node.getLeft() != null) 
	        {
	            return minValue(node.getLeft());
	        }
	        
	        return node.getData();
	    }
	 
	    public void inOrderTraversal() 
	    {
	        traverse(this.root);
	    }
	 
	    private void traverse(Node root) 
	    {
	        if(root == null) 
	        {
	        	return;
	        }
	        
	        traverse(root.getLeft());
	        System.out.print(root.getData() + " ");
	        traverse(root.getRight());
	    }
}
