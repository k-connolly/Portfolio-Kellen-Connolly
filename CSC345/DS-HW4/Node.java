/*
 * This class acts as an inner class of the others. It creates the nodes of the
 * other classes to access and use the linkedlist and queue. It assigns the value
 * of the nodes and uses getters and setters each time those methods are called.
 * The linkedlist implements from this class. The queue implements the methods from
 * linkedlist and this class as well.
 */
public class Node <E>{
	//Variable for the node and its data
	private Node next=null;
	private Node previous=null;
	private E data;
	
	
	public Node(Node next,Node previous,E data) {
		this.next=next;
		this.previous=previous;
		this.data=data;
	}
	
	//getting next value and setting to node
	public Node getNext() {
		return next;
	}
	//getting data from the current node
	public E getData() {
		return data;
	}
	//setting next node
	public void setNext(Node next) {
		this.next = next;
	}
	//setting the data for the next node
	public void setData(E data) {
		this.data = data;
	}

	//returning value of previous node
	public Node getPrevious() {
		return previous;
	}
	
	//Setting the previous node
	public void setPrevious(Node previous) {
		this.previous = previous;
	}

}
