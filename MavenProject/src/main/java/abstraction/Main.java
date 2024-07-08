package abstraction;

public class Main {

	public static void main(String args[])
	{
		AbstarctClassB a = new AbstarctClassB();
		AbstractClass.print1();
		a.print2();
		a.display();
		a.add(10, 20);
		
		//AbstractClass ab = new AbstractClass(); cannot create object of abstract class
		
	}

}
