//Definitely lost on this assignment
public class BookDriver 
{
	//Main method//
	public static void main(String[] args) 
	{
		//Creating stack as objects//
		myGenericStack<Book> toBeSorted = new myGenericStack<Book>();
		myGenericStack<Book> fiction = new myGenericStack<Book>();
		myGenericStack<Book> nonFiction = new myGenericStack<Book>();
		
		//Pushing items into the first stack to be sorted out//
		toBeSorted.push(new Book("A Great Plenty","E. Nuff","fiction"));
		toBeSorted.push(new Book("How to Cut Grass","Lon Moore","nonFiction"));
		toBeSorted.push(new Book("Breaking the Law","Kermit A. Krime","nonFiction"));
		toBeSorted.push(new Book("Chest Pain","I. Koffalott","nonFiction"));
		toBeSorted.push(new Book("Housework","Dustin Cook","nonFiction"));
		toBeSorted.push(new Book("I Love Mathematics","Adam Up","nonFiction"));
		toBeSorted.push(new Book("Armed Heists","Robin Banks","fiction"));
		toBeSorted.push(new Book("Allegiance to the King","Neil Downe","fiction"));
		toBeSorted.push(new Book("Flea Circus", "Ivan Elovanitch","fiction"));
		toBeSorted.push(new Book("Girl on a Budget","Penny Pincher","fiction"));
		toBeSorted.push(new Book("Is O.J. Guilty", "Howard I. Know","nonFiction"));
		toBeSorted.push(new Book("A Stitch in Time", "Justin Case","fiction"));
		toBeSorted.push(new Book("You Want Me To Do What?","Shirley U. Jest","fiction"));
		toBeSorted.push(new Book("Are You Hungry, Monkey?","Ava Banana","nonFiction"));
		toBeSorted.push(new Book("Into the Lion's Den","Hugo First","fiction"));
		toBeSorted.push(new Book("How to Keep Fit","Jim Shorts","nonFiction"));
		toBeSorted.push(new Book("I Lived in Detroit","Helen Earth","nonFiction"));
		toBeSorted.push(new Book("Christmas Music","Carol Singers","nonFiction"));
		toBeSorted.push(new Book("How To Pass Your Final Exam","Noah Lott","nonFiction"));
		toBeSorted.push(new Book("Keep On Trying","Percy Veer","nonFiction"));
		toBeSorted.push(new Book("A New Dawn Coming","Tamara Morning","fiction"));
		toBeSorted.push(new Book("Computers for Dummies","P.C. Lerner","nonFiction"));
		toBeSorted.push(new Book("Late For Class","I. Bluitt","fiction"));
		toBeSorted.push(new Book("Blinded by the Light","I.C. Clerly","fiction"));
		toBeSorted.push(new Book("Yellow River","I.P. Daly","fiction"));
		toBeSorted.push(new Book("Forty years in the saddle","Major Bumsore","nonFiction"));

		while (!toBeSorted.isEmpty()) 
		{
			System.out.println(toBeSorted.peek());
			if(toBeSorted.peek().getCategory().equals("fiction"))
			{
				fiction.push(toBeSorted.peek());
			}
			else
			{
				nonFiction.push(toBeSorted.peek());
			}
			toBeSorted.pop();
		}
		
		System.out.println(fiction.size());
		System.out.println(nonFiction.size());
		System.out.println(fiction.peek());
		System.out.println(nonFiction.peek());
		
		System.out.println(toBeSorted.isEmpty());
		/*
		while (!toBeSorted.isEmpty())
		{
			System.out.println(toBeSorted.peek());
			
			if (toBeSorted.peek().getCategory().equals("Fiction"));
			{
				fiction.push(toBeSorted.peek());
			} else {
				nonFiction.push(toBeSorted.peek());
			}
			
			toBeSorted.pop();
		
		}
		*/
	}
	

}
