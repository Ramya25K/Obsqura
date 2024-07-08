package interfaceexample;

public class HybridInheritance implements InterfaceExampleB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HybridInheritance h = new HybridInheritance();
		//h.add();
		//h.dispaly();
		//h.print1();
		//interfacename objectname = new classname();
		InterfaceExampleB obj = new HybridInheritance();
		obj.add();
		obj.display();
		obj.print1();
		}
	
	

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hybrid 1");
		
	}

	public void add() {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println("Hubrid add" +c);
	}

	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("Hybrid 2");
	}

}
