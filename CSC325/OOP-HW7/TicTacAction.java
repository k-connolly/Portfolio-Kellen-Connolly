package other;
import java.awt.event.*;
public class TicTacAction implements ActionListener,MouseListener 
{
      TicTacPanel TicTacPanel;
      boolean ready;
      
      public TicTacAction(TicTacPanel panel) 
      {
    	 TicTacPanel = panel;
         ready = TicTacPanel.c == 'X';
      }
      
      //Repainting when user clicked//
      public void actionPerformed(ActionEvent e) 
      {
         if (ready) 
         {
        	 TicTacPanel.TicTacToe.clearAll();
            ready = false;
         }
         
         TicTacPanel.paint(TicTacPanel.getGraphics());
      }
      
      //Method that calculates what happens when the user clicks//
      public void mouseClicked(MouseEvent e) 
      {
         if (ready) 
         {
            int x = e.getX();
            int y = e.getY();
            int w = TicTacPanel.getWidth();
            int h = TicTacPanel.getHeight();
            
            x = x/(w/3);
            y = y/(h/3);
            
            if (x >= 0 && x < 3 && y >= 0 && y < 3) 
            {
               switch (TicTacPanel.c) {
                  case 'X': TicTacPanel.TicTacToe.putX(x,y); 
                     break;
                  case 'O': TicTacPanel.TicTacToe.putO(x,y);
                  	break;
               }
            }
            ready = false;
         }
         TicTacPanel.paint(TicTacPanel.getGraphics());
      }
   
      /*
       * Excess to avoid the program from pushing errors
       */
      public void mousePressed(MouseEvent me) { 
      }
      public void mouseReleased(MouseEvent me) { 
      }
      public void mouseEntered(MouseEvent me) { 
      }
      public void mouseExited(MouseEvent me) { 
      }
   
}