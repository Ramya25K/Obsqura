package multilevelinheritance;

public class ChildClassB extends ParentClassA{

	public int subtraction()
	{
		return a-b;
		
	}
	public void addition()
	{
		int sum = a+b+10;
		System.out.println("Child1 here:"+sum);
	}

}
