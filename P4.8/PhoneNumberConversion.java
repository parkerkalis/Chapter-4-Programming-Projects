public class phonenum
{
	static String phonenum = "4155551212";
	public static void main(String args[])
	{
		String sub1 = phonenum.substring(0, 3);
		String sub2 = phonenum.substring(3, 6);
		String sub3 = phonenum.substring(6);
		System.out.println("(" + sub1 + ")" + sub2 + "-" + sub3);
	}
}
