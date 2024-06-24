package accessmodifiers;

public class Modifiers {

	public void display()
	{
		System.out.println("Public Method");
	}
	
	private void display1()
	{
		System.out.println("Private Method");
	}
	
	protected void display3()
	{
		System.out.println("protected Method");
	}
	
	void display4()
	{
		System.out.println("Default Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifiers m = new Modifiers(); //In Java, creating multiple objects of the same class to call different methods is not necessary. Once an object of a class is created, you can use that single object to call any accessible methods of the class. Creating multiple objects for the same class just to call different methods would be inefficient and redundant.Since all these methods belong to the same class, they can be accessed using the single instance m within the same class context.
		m.display();
		m.display1();
		m.display3();
		m.display4();
		
	}

}
