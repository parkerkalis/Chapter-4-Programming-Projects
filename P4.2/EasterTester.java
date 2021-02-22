public class Eastertester
{
   public static void main(String[] args)
   {
      easter myEaster = new easter(2001);

      System.out.println("Month: " + myEaster.getEasterSundayMonth());
      System.out.println("Expected: 4");
      System.out.println("Day: " + myEaster.getEasterSundayDay());
      System.out.println("Expected: 15");      
   }
}
