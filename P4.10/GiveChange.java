import java.util.Scanner;
public class givechange
{
	public static void main(String[] args)
	{
	Scanner myScanner = new Scanner(System.in);
	System.out.println("Enter the amount due here: ");
	double pricetopay = myScanner.nextDouble();
	System.out.println("Enter the amount paid here: ");
	double amountpaid = myScanner.nextDouble();
	int totalcents = (int) ((int) (amountpaid * 100) - (pricetopay * 100));
	int quarters = totalcents / 25;
	totalcents -= quarters * 25;
	int dimes = totalcents / 10;
	totalcents -= dimes * 10;
	int nickels = totalcents / 5;
	totalcents -= nickels * 5;
	int pennies = totalcents / 1;
	System.out.println("Your change is:");
	System.out.println(quarters + " quarters");
	System.out.println(dimes + " dimes");
	System.out.println(nickels + " nickels");
	System.out.println(pennies + " pennies");
	}
}
