package encapsulation;

public class ClassEncapB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEncapA e = new ClassEncapA();
		e.setA(100);
		e.setB(200);
		
		int c = e.getA();
		int d = e.getB();
		System.out.println("The number is:"+c+ ","+d);
		}

}
