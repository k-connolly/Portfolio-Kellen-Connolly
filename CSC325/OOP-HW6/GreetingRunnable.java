import java.util.Date;

/*
 * A Runnable that repeatedly prints a greeting from each thread
 */
public class GreetingRunnable extends Thread implements Runnable
{
	
	//Declarations//
	private static final int DELAY = 500;
	private int counter;
	
	/*
	 * Constructs the runnable object
	 * @Parameter 'counter' to count the threads
	 */
	public GreetingRunnable (int counter)
	{
		super("Thread " + counter);
		this.counter = counter;
	}
	
	@Override
	public void run() 
	{
		//Counter for the threads//
		counter++;
		if (counter <= 51 )
		{
			GreetingRunnable THREAD = new GreetingRunnable(counter);
			THREAD.start();
			
			//Try, catch block//
			try
			{
				THREAD.join();
				Date now = new Date();
				System.out.println(now + " --> Hello from Thread " + getName() +"!");
				Thread.sleep(DELAY);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		
	}

}
