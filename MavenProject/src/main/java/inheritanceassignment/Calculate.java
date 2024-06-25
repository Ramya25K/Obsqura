package inheritanceassignment;

public class Calculate extends Employee {
	
	double hra;
	double pf;
	
	public void calulates()
	{
		hra = 0.05*basic;
		pf =  0.20*basic;
		
	}

}
