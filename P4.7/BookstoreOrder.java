public class bookstore
{
	int bookprice = 10;
	public double pricecalc(int bookorder)
	{
		double numofbooks = bookorder;
		double tax = (bookprice * numofbooks) * 0.075;
		double shipcharge = numofbooks * 2;
		double orderp = tax + shipcharge + (bookprice * numofbooks);
		return orderp;
	}
}
