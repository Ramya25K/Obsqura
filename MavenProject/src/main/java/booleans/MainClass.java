package booleans;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter your amount to check discount");
double amount = sc.nextInt();
double tamt = Customer.total(amount);
Customer.discount(tamt);
sc.close();


;	}

}
