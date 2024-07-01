package encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin number");
		int pin = sc.nextInt();
		
		
		//int[] userpin = {1001, 1234, 1212};
		BankA b = new BankA();
		
		b.setPin(pin,"*");
		boolean value = b.validate();
		if(value)
		{
			System.out.println("The entered pin " +b.getPin()+" is valid");
		}
		else
		{
			System.out.println("The entered pin " +b.getPin()+" is not valid");
		}
		
		
		sc.close();
		
	}

}
