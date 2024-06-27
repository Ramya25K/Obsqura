package aggregation;

public class Address {

	String address;
	Student s;
	
	public Address(String address,Student s)
	{
		this.address = address;
		this.s = s;
	}
	
	public void print()
	{
		System.out.println(s.name);
		System.out.println(s.roll);
		System.out.println(address);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ramya", 100);
		Address a = new Address("Palakkad",s1);
		a.print();
		
	}

}
