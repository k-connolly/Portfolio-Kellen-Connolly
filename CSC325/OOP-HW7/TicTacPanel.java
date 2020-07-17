package other;
import java.awt.*;

import javax.swing.JPanel;
public class TicTacPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	public TicTacGame TicTacToe;
	public char c;

	//Constructor//
   public TicTacPanel(char ch) 
   {
	  TicTacToe= new TicTacGame();
      c = ch;
   }
   
   //Paint method to paint when user clickes each time//
   public void paint(Graphics g) 
   {
      super.paint(g);
      int h = getHeight();
      int w = getWidth();
      
   // clear the screen
      g.setColor(Color.white);
      g.fillRect(0,0,w,h);
      
   // draw the board
      g.setColor(Color.black);
      g.fillRect(0,h/3-3,w,6);
      g.fillRect(0,2*h/3-3,w,6);
      g.fillRect(w/3-3,0,6,h);
      g.fillRect(2*w/3-3,0,6,h);
      
      for (int x = 0; x < 3; x++) 
      {
         for (int y=0;y<3;y++) 
         {
        	 switch(TicTacToe.get(x,y))
        	 {
               case 'X':drawX(g,x,y,w,h); 
                  break;
               case 'O':drawO(g,x,y,w,h);
            }
         }
      }
   }
   
   //Using coordinates to specify how it will paint when called//
   public void drawX(Graphics g,int x,int y,int w,int h) 
   {
      int[] xx = {1,2,4,6,7,5,7,6,4,2,1,3};
      int[] yy = {2,1,3,1,2,4,6,7,5,7,6,4};
      
      for (int i = 0; i < 12; i++) 
      {
         xx[i] = (xx[i]+8*x)*w/24;
         yy[i] = (yy[i]+8*y)*h/24;
      }
      
      Polygon polygon = new Polygon(xx,yy,12);
      g.setColor(Color.red);
      g.fillPolygon(polygon);
   }
   
   //Creating the x and o drawing//
   public void drawO(Graphics g,int x,int y,int w,int h) 
   {
      g.setColor(Color.blue);
      g.fillOval((8*x+1)*w/24,(8*y+1)*h/24,w/4,h/4);
      g.setColor(Color.white);
      g.fillOval((8*x+2)*w/24,(8*y+2)*h/24,w/6,h/6);
   }
}				


