package aggregation;

public class Aggregation2 {

	int c,d;
	Aggregation1 ag;
	public Aggregation2(int c,int d,Aggregation1 ag)
	{
		this.c = c;
		this.d = d;
		this.ag = ag;
	}
	
	public void print()
	{
		System.out.println(c);
		System.out.println(d);
		System.out.println(ag.a);
		System.out.println(ag.b);
	}
	
	public static void main(String args[])
	{
		Aggregation1 ag1 = new Aggregation1(1,2);
		Aggregation2 ag2 = new Aggregation2(3,4,ag1);
		ag2.print();
}
	
}