package booleans;

public class Customer {

	public static double total(double amount)
	{
		double total = amount;
		return total;
		
	}
	
	public static double discount(double tamt )
	{
		double discount;
		if(tamt>=5000)
		{
			discount = tamt*0.2;
			System.out.println("Since your amount is "+tamt+ ", your eligible for discount of "+discount);
		}
		else
		{
			discount = tamt;
			System.out.println("Since your amount is "+tamt+ ", your not eligible for discount ");
		}
		return discount;
		
	}
}
