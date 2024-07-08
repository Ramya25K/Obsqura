package multipleinheritanceassign;

public class ChildClass implements InterfaceA,InterfaceB {

	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		int c = a*b;
		System.out.println("The product is:"+c);
		return c;
	}

	public int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		int d = a+b+c;
		System.out.println("The addition is:"+d);
		return d;
	}

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int e = a+b;
		System.out.println("The addition is:"+e);
		return e;
	}

	

	

}
