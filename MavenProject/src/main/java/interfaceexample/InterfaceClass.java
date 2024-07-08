package interfaceexample;

public class InterfaceClass implements InterfaceExample,InterfaceExampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass i = new InterfaceClass();
		i.add();
		i.display();
		i.print1();
		

	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("This an abstract method");
		
	}

	public void add() {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println("Addition of abstrct method is:"+c);
		
	}

	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("This is an multiple inheritance");
	}

}
