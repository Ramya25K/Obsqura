package accessmodifier2;

public class Thiskey {
int a ;
int b;

public Thiskey()//5
{
	System.out.println("DEfault");
}
public Thiskey(int a, int b)//3
{
	this(); // to invoke default constructor//4
	this.a= a;//6
	this.b =b;
	this.display();//7
			}

public void display()//8
{
	System.out.println(a);
	System.out.println(b);
	this.display1();//9
}

public void display1()//10
{
	System.out.println("Ramya");
}
	public static void main(String[] args) {//1
		// TODO Auto-generated method stub
		Thiskey t = new Thiskey(10,5);//2
	//	t.display();
		
	}

}
