package abstraction;

public abstract class AbstractClass {

	public AbstractClass()
	{
		System.out.println("This is a abstract constructor");
	}
	
	public abstract void display();
	
	public static void print1()
	{
		System.out.println("This is a static method");
	}
	
	public void print2()
	{
		System.out.println("This is a instance method");
	}
	
	public abstract void add(int a, int b);
}
