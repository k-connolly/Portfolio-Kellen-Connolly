
public class Player 
{
		
		private String name; //instance variable
		private String score; //instance variable
		
		public Player(String name, String score) 
		{
			this.name = name;
			this.score = score;
		}
		
		// Setter/Getters for Name and Score //
		
			// Name Declaration//
			public String getName()                          
			{                                                
				return name; // return value of name
			}     
			
			public void setName(String name)              
			{                                             
				 this.name = name; // store the name        
			}                                      
	
			
			//Score Declaration//
			public String getScore()                          
			{                                                
				return score; // return value of score
			}	     
			
			public void setScore(String score)              
			{                                             
				 this.score = score; // store the score      
			}	        
			
			// toString method //
			public String toString() 
			{
				String str="Name: " + name + ", Score: " + score;
				return str;
			}	
		
}
