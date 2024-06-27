package polymorphism;

public class Offseason extends Onseason {

	//double price;
	public double discount(double price)
	{
		super.discount(price);
		double discount = 0.15 * price;
		System.out.println("Discounted value in Offseason is: " +discount);
		return discount;
	}
	
	

}
