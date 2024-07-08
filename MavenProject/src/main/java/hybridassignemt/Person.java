package hybridassignemt;

public class Person implements DetailsDisplay{
	
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name:" +name);
		System.out.println("Age :" +age);
	}
	

}
