
public class HomeworkAgain 
{

	public static void main(String[] args) 
	{
		
		//variables that hold people
		int GR;
		int BR;
		int AR;
		int SR;
		int FR;
		int LR;
		int MR;
		int PR;
		int GA;
		
		//variables that hold nights
		int G = 1;
		int B = 2;
		int A = 3;
		int S = 4;
		int F = 5;
		int L = 6;
		int M = 7;
		int P = 8;
		int R = 9;
		
		int day;
		
		// Loop for days //
		for(day = 0; day >= 0; day++) {
			
			GR = day % G;
			if (GR == 0); {
				System.out.println("Day is: " + day);
				System.out.println("Gimli");

				BR = day % B;
				if (BR == 0); {
					System.out.println("Boromir");
				
					AR = day % A;
					if (AR == 0); {
						System.out.println("Aragon");
				
						SR = day % S;
						if (SR == 0); {
							System.out.println("Sam");
				
							FR = day % F;
							if (FR == 0); {
								System.out.println("Frodo");
				
								LR = day % L;
								if (LR == 0); {
									System.out.println("Legolas");
				
									MR = day % M;
									if (MR == 0); {
										System.out.println("Merry");
				
										PR = day % P;
										if (PR == 0); {
											System.out.println("Pippin");
				
											GA = day % R;
											if (GA == 0); {
												System.out.println("Gandalf");
																						
											} //if GA
										} //if PR
									} //if MR
								} //if LR
							} //if FR
						} //if SR
					} //if AR
				} //if BR
			} //if GR
			
			if (GR == BR == AR == SR == FR == LR == MR == PR == GA) {
				System.out.println("Everyone is at the bar.");
			} //if valid
		} //for

	} //main

} //class
