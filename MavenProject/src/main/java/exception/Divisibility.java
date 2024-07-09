package exception;

public class Divisibility {

	public void disivibility()
	{
		try {
		int a = 10;
		int b = a/0;
		System.out.println(b);
	}
		catch(ArithmeticException a)
		{
			System.out.println("Execption handled" +a);
		}
		finally
		{
			System.out.println("Exception handled successfully");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisibility d = new Divisibility();
		d.disivibility();
	}

}
