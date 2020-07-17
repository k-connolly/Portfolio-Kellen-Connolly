package other;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class TicTacToe 
{
	
   public static void main(String args[]) 
   {
      try 
      {
    	  //Creating the frame//
         Frame frame = new Frame("Tic-Tac-Toe");
         frame.setSize(360,360);
         frame.addWindowListener(new WindowAdapter() 
         {
        	 public void windowClosing(WindowEvent we) 
        	 {
        		 System.exit(-1);
             }
         } ) ;
         
      	char ch;
      	if (args.length == 0)
      	{
      		ch = 'O';	
      	}
      	else 
      	{
      		ch = 'X';
      	}
      	//Object declarations//
         TicTacPanel TicPanel = new TicTacPanel(ch);
         Button button = new Button("Clear");
         TicTacAction TicAction = new TicTacAction(TicPanel);
         
         //Adding to the window//
         button.addActionListener(TicAction);
         TicPanel.add(button);
         TicPanel.addMouseListener(TicAction);
         frame.add(TicPanel);
         frame.setVisible(true);
         
         //Networking declarations//
         Socket socket;
         ObjectOutputStream outputStream;
         ObjectInputStream inputStream;
         
         switch (ch) 
         {
            case 'O':
            	
               socket = (new ServerSocket(7777)).accept();
               outputStream = new ObjectOutputStream(socket.getOutputStream());
               outputStream.writeObject(TicPanel.TicTacToe);
               TicAction.ready = false;
               break;
               
            case 'X':
            	socket = (new ServerSocket(7777)).accept();
            	outputStream = new ObjectOutputStream(socket.getOutputStream());
            	outputStream.writeObject(TicPanel.TicTacToe);
            	TicAction.ready = false;
            	break;
            	
            default:
               socket = new Socket(args[0],7777);
         		TicAction.ready = true;
         
         }
         
         //Running part of the server//
         while(true) 
         {
            inputStream = new ObjectInputStream(socket.getInputStream());
            TicPanel.TicTacToe = (TicTacGame)(inputStream.readObject());
         	TicPanel.paint(TicPanel.getGraphics());
            TicAction.ready = true;
            
            while (TicAction.ready) 
            {
               Thread.sleep(100);
            }
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(TicPanel.TicTacToe);
         }
      }
      catch (Exception e) 
      { 
            System.out.println(e); System.exit(1); 
      }
   
   
   }
}