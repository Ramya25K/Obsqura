package booleans;


public class Eligible {


	public static boolean eligible(int a)
	{
		
		if(a>=18)
		{
			System.out.println("Eligible");
			return true;
		}
		System.out.println("Not Eligible");
		return false;
		
	}
}
