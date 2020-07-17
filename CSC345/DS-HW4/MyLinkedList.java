/*
 * Each element of the list is a node. It has the data and its reference 
 * to the next node. Each node has a value and a pointer to the next node.
 * When adding a new node we add it to the rear and set that value to the current
 * node. We construct the nodes in order to create the add/remove and traverse method
 * When adding a node to the front we assign the value of the new node to the front.
 * Finally, when we call the traverse method it loops through and prints out
 * the data of the current node and uses the .getNext to read the next node
 */
public class MyLinkedList {
	
	private Node front=null;
	private Node rear=null;
	private Node currentNode=null;
	
	//Traverse method
	public void traverse() {
		currentNode=front;
		while(currentNode!=null) {
			System.out.println(currentNode.getData());
			currentNode=currentNode.getNext();
		}
	}
	
	//Adding node to rear method
	public void addNodeToRear(String data) {
		if(currentNode==null) {
			currentNode=new Node(null,null,data);
			
			front=currentNode;
		}else {
			currentNode=new Node(currentNode.getPrevious(),rear,data);
			currentNode.getPrevious().setNext(currentNode);
		}
		rear=currentNode;
	}
	
	//Adding node to the front
	public void addNodeToFront(String data) {//is used for stacks
		Node newNode=new Node(front,currentNode.getNext(),data);
		front=newNode;
	}
	
	//Getters for remove, front, and rear
	public void removeNode() {
		front=front.getNext();
	}
	public Node getFront() {
		return front;
	}
	public Node getRear() {
		return rear;
	}

	//Setters for the front, rear and returning the current node
	public void setFront(Node front) {
		this.front = front;
	}
	public void setRear(Node rear) {
		this.rear = rear;
	}
	public Node getCurrentNode() {
		return currentNode;
	}

	//Setting the current node
	public void setCurrentNode(Node currentNode) {
		this.currentNode = currentNode;
	}

}