/*
 * Runs the greeting threads in parallel
 */
public class GreetingThreadRunner 
{
	public static void main(String[] args)
	{
		//Creating object of the class//
		GreetingRunnable r1 = new GreetingRunnable(1);
		
		//Creating thread object//
		Thread t1 = new Thread(r1);
		
		//Calling the start method//
		t1.start();
	}
}
