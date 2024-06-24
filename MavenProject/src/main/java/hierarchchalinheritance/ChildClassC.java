package hierarchchalinheritance;

public class ChildClassC extends ParentClassA {
	
	public int addition()
	{
		int sum = a+b+10;
		System.out.println("The sum is in ChildC: "+sum);
		return sum;
	}
	public int sub()
	{
	int sum1;
	sum1 = a-b;
	System.out.println("The difference is in ChildC: "+sum1);
	return sum1;
	}
	

}
