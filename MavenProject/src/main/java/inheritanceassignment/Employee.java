package inheritanceassignment;
import java.util.*;

public class Employee {
	
	double basic;
	double deduct;
	double bonus;
	
	public void details()
	{
	Scanner sc = new Scanner(System.in);
	
	//Enter basic pay
	System.out.println("Enter your basic pay: ");
	basic = sc.nextDouble();
	
	//Enter deduction
		System.out.println("Enter your deduction amount: ");
		deduct = sc.nextDouble();
		
		//Enter bonus pay
		System.out.println("Enter your bonus pay: ");
		bonus = sc.nextDouble();
	
		sc.close();
	
	
	

}
}