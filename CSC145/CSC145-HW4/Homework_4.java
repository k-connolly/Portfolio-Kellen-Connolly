import java.util.Scanner;
public class Homework_4 
{

	public static void main(String[] args) 
	{
		// Input for Year //
		Scanner scan = new Scanner(System.in);
			int year;
			
		System.out.println("Enter Year: ");
			year = scan.nextInt();
			
		scan.close();
		
		// If statements to determine regular year or leap year //
		if(year<1582) 
			{
			System.out.println("The date entered was not adopted"
					+ " in the Gregorian at that time.");
			}
		else if (LeapYear(year)) 
			{
			System.out.println(year + " the date entered is a "
					+ "leap year.");
			}
		else 
			{
			System.out.println(year + " the date entered is not"
					+ " a leap year.");
			}
		
	}
		// Calculations (passes) to determine regular year or leap year //
		private static boolean LeapYear(int Year) 
		{
			int pass1 = Year%4;
			int pass2 = Year%400;
			int pass3 = Year%100;
			
			if (pass2 == 0) return true;
			else if ((pass1 == 0 && pass3 !=0) && pass2 == 0) return true;
			else if ((pass1 == 0) && (pass2 !=0 && pass3 !=0)) return true;
			else return false;
		}
	
}
