package multilevelassign;

public class Emplyoee extends Person {
	
	String empid;
	String dept;
	 public Emplyoee(String name, int age, String empid, String dept) {
	        super(name, age);
	        this.empid = empid;
	        this.dept = dept;
	 }
	public void showEmployeeDetails()
	{
		System.out.println("Employee ID " +empid);
		System.out.println("Department " +dept);
		
	}

}
