package polymorphism;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of product");
		double price = sc.nextDouble();
		Offseason off = new Offseason();
		off.discount(price);
		sc.close();
	}

}
