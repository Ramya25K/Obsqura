package inheritance;

public class ChildClass extends ParentClass {

	public void childclass1()
	{
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.Add();
		c.childclass1();
		
		int d = c.a;
	System.out.println(d);
	}

}
