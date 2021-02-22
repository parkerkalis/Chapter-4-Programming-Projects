public class TenEightNinePuzzle
{
    static int reverse(int n)
    {
    	int num1 = n / 100;
    	int num2 = (n % 100) / 10;
    	int num3 = n % 10;
    	int num4 = 100 * num3 + 10 * num2 + num1; 
    	return num4;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      TenEightNinePuzzle number = new TenEightNinePuzzle();
      System.out.println("Input: " + "371");
      System.out.println("Reversed: " + TenEightNinePuzzle.reverse(371));
      System.out.println("Difference: " + (371 - TenEightNinePuzzle.reverse(371)));
      System.out.println("Reversed: " + TenEightNinePuzzle.reverse(371 - TenEightNinePuzzle.reverse(371)));
      System.out.println("Sum: " + ((371 - TenEightNinePuzzle.reverse(371)) + TenEightNinePuzzle.reverse(371 - TenEightNinePuzzle.reverse(371))));
    }
}

