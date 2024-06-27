package polymorphism;

public class ClassB extends ClassA{

	int c=10;
	public void addition()
	{
		super.addition();
		int sum = a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB c = new ClassB();
		c.addition();
		
		
	}

}
