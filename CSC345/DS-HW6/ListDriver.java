
public class ListDriver 
{
	// Don't need a constructor for this class //
	/*
	public ListDriver() 
	{
		UnorderedList list1 = new UnorderedList();
	}
	*/
	public static void main(String[] args) 
	{
		//UnorderedList list1= new UnorderedList();
		UnorderedList list1 = new UnorderedList();
		
		//The base list//
		list1.addToFront("1");
		list1.addAfter("1", "2");
		list1.addAfter("2", "3");
		list1.addToRear("4");
		list1.addToRear("5");
		list1.addToRear("6");
		list1.examination();
		System.out.println("Size of list:" + list1.getSize());
		
		System.out.println(""); //Spacer
		
		//operations
		list1.removeFront();
		list1.removeRear();
		list1.examination();
		System.out.println("Size of list:" + list1.getSize());
		list1.clear();
		System.out.println("Size of list:" + list1.getSize());
		
		System.out.println("");
		
		//New list example//
		list1.addToFront("1");
		list1.addToFront("2");
		list1.addToFront("3");
		System.out.println("Front is now: " +list1.getFront());
		list1.addToRear("4");
		list1.addToRear("5");
		list1.addToRear("6");
		System.out.println("Rear is now: " +list1.getRear());
		System.out.println("Size of list:" + list1.getSize());
		list1.examination();
		
		//Remove front and rear//
		list1.removeFront();
		list1.removeRear();
		System.out.println("Front is now: " +list1.getFront());
		System.out.println("Rear is now: " +list1.getRear());
		System.out.println("Size of list:" + list1.getSize());
		list1.clear();
		
		System.out.println("");
		
		//Repeating list//
		list1.addToFront("1");
		list1.addToFront("1");
		list1.addToFront("1");
		list1.addToFront("2");
		list1.addToRear("2");
		list1.addToFront("3");
		list1.addToFront("3");
		list1.addToFront("3");
		list1.addToFront("4");
		list1.addToFront("5");
		list1.addToFront("5");
		list1.addToFront("5");
		list1.addToFront("5");
		list1.addToFront("5");
		list1.examination();
		System.out.println("Size of list:" + list1.getSize());
		
		System.out.println(""); //Spacer
		
		//operations//
		list1.removeFirst("1");
		list1.removeAll("2");
		list1.replaceFirst("3", "Replaced 3");
		list1.replaceAll("5", "Replaced 5");
		list1.examination();
		System.out.println("Size of list:" + list1.getSize());
		list1.clear();
		System.out.println("Size of list:" + list1.getSize());
				
	}
}
