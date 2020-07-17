/*
 * This class creates objects of the queue class and uses them as checkouts. 
 * In the execution part, if the checkout line has too many 'customers', it prints out
 * that it is opening another register. If the checkout line is open and its size 
 * is less than that of checkout 1's size, then it pushes the customers number into
 * the 2nd queue. Else, if all that does not equal true for line two then it 
 * pushes the customers number into the first queue. It then increments the next
 * customers number in the loop.
 * 
 * For checkout 1 if the random number is equal to 1 and the checkout size is greater than zero, it 
 * dequeues the customer from the queue. If the random number for checkout two is equal to 2 and checkout 2
 * is open, then it dequeues the customer from the queue. (The customers that leave
 * were originally at the front of the queue)
 * 
 * Also note, there does not seem to be any termination of the program, it has 
 * to be terminated manually.
 */
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class QueueDriver {
    public int custNumber = 1;
    private MyQueue checkout1=new MyQueue();
	private MyQueue checkout2=new MyQueue();
	private boolean twoOpen=false;
	
    public static void main(String[] args) {
    	//creating object of the class
        final QueueDriver test = new QueueDriver();
        
        //object of timer
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                test.doStuff();
            }
        }, 0, test.custNumber);
    }

    public void doStuff(){
    	//object of random
       Random rand = new Random();
       int randomNum=rand.nextInt(5);
       
       if (randomNum==0){
    	   
          if(checkout1.size()>5&&!twoOpen){
        	  twoOpen=true;
        	  System.out.println("Too many customers, opening another cash register");
          }
          if(twoOpen&&checkout2.size()<checkout1.size()){
        	  checkout2.enqueue("Customer# "+custNumber);
        	  System.out.println("Customer# "+custNumber+" gets in line at cash register#2");
          }else{
        	  checkout1.enqueue("Customer# "+custNumber);
        	  System.out.println("Customer# "+custNumber+" gets in line at cash register#1");
          }
          custNumber++;

          
       }else{ 
    	   if(randomNum==1){
    		   if(checkout1.size()>0){
    			   System.out.println(checkout1.front()+" leaves cash register#1");
    			   checkout1.dequeue();
    		   }
    	   }else{ 
    		   if(randomNum==2&&twoOpen){
        		   if(checkout2.size()>0){
     
        			   System.out.println(checkout2.front()+" leaves cash register#2");
        			   checkout2.dequeue();
        		   }
    		   }
    	}
       }
       
       /*
        * If checkout 1's size is greater than zero, it prints out what customer
        * is at the front, which one is in the back and the size of the queue
        * If checkout 2's size is greater than zero, it also prints out what customer
        * is at the front, which one is in the back and the size of the queue.
        */
       if(checkout1.size()>0){
    	   System.out.println("Cash register#1 Front: "+checkout1.front()+" Rear: "+checkout1.rear()+" Size: "+checkout1.size());
       }
       if(twoOpen&&checkout2.size()>0){
    	   System.out.println("Cash register#2 Front: "+checkout2.front()+" Rear: "+checkout2.rear()+" Size: "+checkout2.size());
       }
       
       /*
        * If checkout 2 is open and its size is relational to 0, then it changes
        * the value of line two to close and prints out the statement because 
        * there are not enough customers in queue.
        */
       if(twoOpen&&checkout2.size()==0){
    	   twoOpen=false;
    	   System.out.println("Not enough customers to justify two cash registers. Closing second cash register");
       }
       
    }
}