package exception;

public class Eligibility {

	//int age = 24;
	public void eligible(int age)
	{
		if(age >=18)
		{
			System.out.println("Eligible for licence");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
			//System.out.println("Not eligible for licence");
		}
	}
	public static void main(String args[]) {
		Eligibility e = new Eligibility();
		e.eligible(4);
	}
}

