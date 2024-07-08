package multilevelassign;

public class Teacher extends Emplyoee {

	String sub;
	int yoe;
	
	public Teacher(String name, int age, String empid, String dept, String sub, int yoe) {
        super(name, age, empid, dept);
        this.sub = sub;
        this.yoe = yoe;
    }
	
	public void showTeacherDetails()
	{
		System.out.println("Subject " +sub);
		System.out.println("Years of experience " +yoe);
		  System.out.println("The employee is " + name + " and her employee ID is " + empid +
                  ". She works in the " + dept + " department, teaches " + sub +
                  ", and has " + yoe + " years of experience.");
	}
}
