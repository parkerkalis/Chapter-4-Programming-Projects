import java.util.Scanner;

public class DiscountCalculator
{
	public static void main(String args[]) 
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the number of movie rentals: ");
		int rentals = myScanner.nextInt();
		System.out.println("Enter the number of members referred to the video club: ");
		int refferals = myScanner.nextInt();
		double discount = refferals + rentals; 
		System.out.println("The discount is equal to: " + Math.min(discount, 75.0) + " percent.");

	}
	
}
