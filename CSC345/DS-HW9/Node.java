
public class Node 
{
 
    private Node left = null;
    private Node right = null;
    private Node prev = null;
    private Integer data; // Integer wrapper class around data
 
    // Constructor //
    public Node(Integer data) {this.data = data;}
    
    // Getters and Setters //
    public Node getRight() {return right;}
    
    public void setRight(Node right) {this.right = right;}
 
    public Integer getData() {return data;}
 
    public void setData(Integer data) {this.data = data;}

	public Node getPrev() {return prev;}

	public void setPrev(Node prev) {this.prev = prev;}
	
    public Node getLeft() {return left;}
    
    public void setLeft(Node left) {this.left = left;}
	
}