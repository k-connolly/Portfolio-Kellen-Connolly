import java.util.Scanner;
/*
 * This program has the user input the 
 * variables of Length and width, it then
 * calculates the area and perimeter of the 
 * 2 values
 */
public class length_width_area_perimeter 
{

	public static void main(String[] args) 
	{
		//User input on length and width
		Scanner in = new Scanner(System.in);
			System.out.print("User input for Length: ");
				double L = in.nextDouble();
			System.out.print("User input for Width: ");
				double W = in.nextDouble();
		in.close();
		
		//Calculations for area and perimeter//
		double area = L * W;
		double perimeter = 2 * (L + W);
		
		//Printing out the data//
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);

	}

}
