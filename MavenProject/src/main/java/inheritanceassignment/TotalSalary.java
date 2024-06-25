package inheritanceassignment;

public class TotalSalary extends Calculate {

	double total;
	
	public void salary()
	{
		total = basic+hra-pf-deduct+bonus;
	}
	
	public void display()

	{
		System.out.println("Your Playslip details are below: ");
		System.out.println("-----------------------------------------");
		System.out.println("Basic pay: "+basic);
		System.out.println("Deduction: "+deduct);
		System.out.println("Bonus: "+bonus);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Total Salary: "+total);
		System.out.println("-----------------------------------------");
		
		
		
		
		
	}
	}

