public class easter
{
	int n;
	int p;
	public easter(int year)
	{

		int y = year;
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
	}
	public int getEasterSundayMonth()
	{
		return n;
	}
	public int getEasterSundayDay()
	{
		return p;
	}
			}
