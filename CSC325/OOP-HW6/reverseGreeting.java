
public class reverseGreeting extends Thread
{
	private int counter;
	
	public reverseGreeting (int counter)
	{
		super("Thread " + counter);
		this.counter = counter;
	}
	
	public void run()
	{
		counter++; 
		if (counter <= 51)
		{
			reverseGreeting thr = new reverseGreeting(counter);
			thr.start();
			try 
			{
				thr.join();
				System.out.println("Hello from " + getName());
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		reverseGreeting th1 = new reverseGreeting(1);
		th1.start();
	}
	/*
	 * {
			for (int i = 1; i <= REPETITIONS; i++)
			{
				Date now = new Date();
				System.out.println(now + " " + greeting);
				Thread.sleep(DELAY);
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	 */
}