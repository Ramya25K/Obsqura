package abstraction;

public class AbstarctClassB extends AbstractClass {

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an abstract method");
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub

		int c = a+b;
		System.out.println(c);
	}
}
