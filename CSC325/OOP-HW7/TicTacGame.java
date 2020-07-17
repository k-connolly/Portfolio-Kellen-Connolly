package other;
  import java.io.*;

public class TicTacGame implements Serializable 
{
   private static final long serialVersionUID = 1L;
   char[] position = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
   
   //Clearing all squares//
      public void clearAll() 
      {
         for (int i=0;i<9;i++) 
            position[i] = ' ';
      }
      
      public void clear(int i) 
      {
         position[i]=' ';
      }
      
      public void clear(int x, int y) 
      {
         position[x+y*3]=' ';
      }
      
      public void putX(int i) 
      {
         position[i]='X';
      }
      
      public void putX(int x, int y) 
      {
         position[x+y*3]='X';
      }
   
      public void putO(int i) 
      {
         position[i]='O';
      }
      
      public void putO(int x, int y) 
      {
         position[x+y*3]='O';
      }
      
      public char get(int i) 
      {
         return position[i];
      }
      
      public char get(int x, int y) 
      {
         return position[x+3*y];
      }
   }	

