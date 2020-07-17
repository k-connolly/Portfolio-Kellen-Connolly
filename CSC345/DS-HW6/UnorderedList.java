
public class UnorderedList 
{
	
	private Node front=null;
	private Node rear=null;
	private int size = 0;
	
	// Method to Add to front //
	public void addToFront(String E) 
	{
		Node newNode = new Node(null, E);
		
		if(size != 0) 
		{
			front.setNext(newNode);
		}
		else 
		{
			rear = newNode;
		}
		front = newNode;
		size++;
		
	}
	
	// Method to Add to rear //
	public void addToRear(String E) 
	{
		Node newNode = new Node(null, E);
		
		if(size == 0) 
		{
			front=newNode;
		}
		else 
		{
			newNode.setNext(rear);
		}
		rear = newNode;
		size++;
	}
	
	// Method to Add after //
	public void addAfter(String E, String newE) 
	{
		if(size != 0) 
		{
			Node currentNode = rear;
			
			while(currentNode != null) 
			{
				if(currentNode.getData().equals(E)) 
				{
					Node newNode = new 
					Node(currentNode.getNext(),newE);
					currentNode.setNext(newNode);
					size++;
					break;
				}
				currentNode=currentNode.getNext();
			}
		}
	}
	
	// Method to remove element from the front 
	public void removeFront() 
	{
		if(front != null) 
		{
			Node currentNode = rear;
			while(currentNode.getNext() != front) 
			{
				currentNode = currentNode.getNext();
			}
			front = currentNode;
			size--;
		}
	}
	
	// Method to remove element from rear //
	public void removeRear() 
	{
		if(rear != null) 
		{
			rear = rear.getNext();
		}
		size--;
	}
	
	//Method to remove the first element //
	public void removeFirst(String E) 
	{
		if(size != 0)
		{
			Node currentNode = rear;
			while (currentNode != null && currentNode.getNext() != null)
			{
				if(currentNode == rear && currentNode.getData().equals(E))
				{
					removeRear();
					size--;
					break;
				}
				else if(currentNode == front && currentNode.getData().equals(E))
				{
					removeFront();
					size--;
					break;
				}
				else if(currentNode.getNext().getData().equals(E))
				{
					currentNode.setNext(currentNode.getNext().getNext());
					size--;
					break;
				}
				currentNode = currentNode.getNext();
			}
		}
	}
	
	// Method to remove all specific elements //
	public void removeAll(String E) 
	{
		if(size != 0)
		{
			Node currentNode = rear;
			while(currentNode != null && currentNode.getNext() != null)
			{
				if(currentNode == rear && currentNode.getData().equals(E))
				{
					removeRear();
					size--;
				}
				else if(currentNode == front && currentNode.getData().equals(E))
				{
					removeFront();
					size--;
				}
				else if(currentNode.getNext().getData().equals(E))
				{
					currentNode.setNext(currentNode.getNext().getNext());
					size--;
				}
				currentNode = currentNode.getNext();
			}
		}
		else 
		{
			System.out.println("Cannot remove from an empty list!");
		}
	}
	
	// Method to replace first element //
	public void replaceFirst(String O_Data, String N_Data)
	{
		Node currentNode = rear;
		while(currentNode != null)
		{
			if(currentNode.getData().equals(O_Data))
			{
				currentNode.setData(N_Data);
				break;
			}
			currentNode = currentNode.getNext();
		}
	}
	
	// Method to replace all specific elements //
	public void replaceAll(String O_Data, String N_Data)
	{
		Node currentNode = rear;
		while(currentNode != null)
		{
			if(currentNode.getData().equals(O_Data))
			{
				currentNode.setData(N_Data);
			}
			currentNode = currentNode.getNext();
		}
	}
	
	// Clears all from the list, setting them all to null and the size 0 //
	public void clear() 
	{
		rear = null;
		front = null;
		size = 0;
	}
	
	
	/*
	 * Getters for the front, rear and size 
	 */
	public String getFront()
	{
		if(front != null)
		{
			return front.getData();
		}
		else
		{
			return "Empty!";
		}
	}
	
	public String getRear()
	{
		if(rear != null)
		{
			return rear.getData();
		}
		else
		{
			return "Empty!";
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	/*
	 * Displays what the methods are doing when called //
	 * Displays the current nodes data through the loop //
	 */
	public void examination()
	{
		Node currentNode = rear;
		while(currentNode != null)
		{
			System.out.println(currentNode.getData());//current node that gets the data
			currentNode = currentNode.getNext();//gets next node
		}
	}
	
}