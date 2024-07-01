package finals;

public class ClassA extends ClassMethod  {

	final int a = 100;
	
	/*public ClassA()
	{
		a = 200;
	}*/
	/*public void print()
	{
		//a=20; cannot be changed since final keyword
		System.out.println("Hi"+a);
	}
	
/*public final void print()
{
	final methods cannot be overriden
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		System.out.println(a.a);
		a.print();
		//we can inherit the first method
		
	}

}
