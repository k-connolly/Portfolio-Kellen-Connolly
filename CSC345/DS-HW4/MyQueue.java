/*
 * When adding an element to the queue it calls the linkedlist to and the
 * node to the rear, each time it pushes an element in, the size increments.
 * When removing an element from the queue, it checks if the size is not equal
 * to 0, if it isn't then it removes a node. However, if the size is equal to
 * one, then it sets the front, rear, and the current node to null. If it the size
 * equals zero, then it prints out that the queue is empty.
 */
public class MyQueue<E> {
	private int size=0;
	
	private MyLinkedList linkedlist=new MyLinkedList();
	
	//Adding node to queue, incrementing size
	public void enqueue(String element) {
		linkedlist.addNodeToRear(element);
		size++;
	}
	
	//if the size of the queue is not = 0, then remove node
	//if size is 1 then it will set all nodes null
	public void dequeue() {
		if(size!=0) {
			
			linkedlist.removeNode();
			if(size==1){
				linkedlist.setFront(null);
				linkedlist.setRear(null);
				linkedlist.setCurrentNode(null);
			}
			size--;
		}else {
			System.out.println("The queue is already empty");
		}
	}
	
	//returning the data for front
	public E front() {
		E element= (E)linkedlist.getFront().getData();
		return element;
		
	}
	
	//returning the data for rear
	public E rear() {
		E element=(E)linkedlist.getRear().getData();
		return element;
		
	}
	
	//return for the size
	public int size() {
		return size;
	}
	
	//checking to see the queue is empty
	public boolean isEmpty() {
		if (size==0)
			return true;
		else
			return false;
	}

	

}