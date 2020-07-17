
public class PostFixDriver 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		//Creating the Object, the 'stack'//
		@SuppressWarnings("unchecked")
		MyGenericStack<String> stack = new MyGenericStack();
		
		//The representation of the expression, then split into the String[] array//
		String postfix = "7 4 -3 * 1 5 + / *";
		String[] splitPostfix = postfix.split(" ");
		
		//Representation of strings and where they are located in their indexes//
		//String splitPostfix1 = splitPostfix[0]; --> 7
		//String splitPostfix2 = splitPostfix[1]; --> 4
		//String splitPostfix3 = splitPostfix[2]; --> -3
		//String splitPostfix4 = splitPostfix[3]; --> *
		//String splitPostfix5 = splitPostfix[4]; --> 1
		//String splitPostfix6 = splitPostfix[5]; --> 5
		//String splitPostfix7 = splitPostfix[6]; --> +
		//String splitPostfix8 = splitPostfix[7]; --> /
		//String splitPostfix9 = splitPostfix[8]; --> *
		
		//Looping so that it evaluates all elements in the string from the 'splitPostfix'
		for(String element : splitPostfix)
		{
			//Checking to make sure that they are strings with 'or' statements and not mathematical operators//
			if(!(element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")))
			{
				stack.push(element);
			}
			
			//Takes in the top 2 items on the stack, then replaces the previous ones//
			else
			{
				//Converting strings to integers//
				float y = Float.parseFloat(stack.peek()); 
				stack.pop();
				float z = Float.parseFloat(stack.peek());
				stack.pop();
				
				//Switch statement to evaluate all expressions of the string//
				switch (element) 
				{
				case "+":
					stack.push(String.valueOf(y + z));
					break;
				case "/":
					stack.push(String.valueOf(y / z));
					break;
				case "*":
					stack.push(String.valueOf(y * z));
					break;
				default:
					stack.push(String.valueOf(y - z));
					break;
				}
			}
		}
		
		//Output the result of the program//
		System.out.println(postfix);
		System.out.println("Result: " + stack.peek());
		
	}

}
