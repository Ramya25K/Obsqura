/*package inheritanceassign;

public class TotalSalary extends PaySlip implements Calculate{
//	int basic;
//	int deduct;
//	int bonus;
	double hra;
	double pf;
	
	
	

	public TotalSalary( int basics, int deduct, int bonus) {
		super(basics, deduct, bonus);
		
		this.hra = hra;
		this.pf = pf;
	}

	public double  total()
	{
		double total = this.basic+this.hra-this.pf-this.deduct+this.bonus;
		System.out.println("Your Total salary: "+total);
		return total;
	}
	
	public void salarydisplay()
	{
		System.out.println("YOUR SALARY DETAILS ARE BELOW:");
		System.out.println("Basic Pay: "+basic);
		System.out.println("Deduction: "+deduct);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);

		
		
	}

	public double hra() {
		double hra = 0.05*this.basic;
		// TODO Auto-generated method stub
		return hra;
	}

	public double pf() {
		double pf = 0.20 * this.basic;
		// TODO Auto-generated method stub
		return pf;
	}
}*/
