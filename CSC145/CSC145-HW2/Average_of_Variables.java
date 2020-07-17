import java.util.Scanner;
/*
 * This Program takes 3 user input integers
 * and calculates the average of the inputs
 */
public class Average_of_Variables {

	public static void main(String[] args)
	{
		//User input for variables a,b,c//
		Scanner in = new Scanner(System.in);
			System.out.print("Variable 1: ");
				double a = in.nextDouble();
			System.out.print("Variable 2: ");
				double b = in.nextDouble();
			System.out.print("Variable 3: ");
				double c = in.nextDouble();
			System.out.print("The average of a, b, and c is: " + average(a,b,c) + "\n");
		in.close();
	}
	
	//Method that does the calculation//
	public static double average(double a, double b, double c)
	{
		return(a+b+c)/3;
	}
}
