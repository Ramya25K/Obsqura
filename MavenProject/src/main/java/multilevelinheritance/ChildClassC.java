package multilevelinheritance;

public class ChildClassC extends ChildClassB {
	
	public int multiplication()
	{
		return a*b;
	}
	public void addition()
	{
		int sum = a+b+19;
		System.out.println("Child2 here:"+sum);
	}
}
