package multilevelassign;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("Ramya",27,"R100","CSE","Networking",4);
		//public Teacher(String name, int age, String empid, String dept, String sub, int yoe) {
		t.showDetails();
		t.showEmployeeDetails();
		t.showTeacherDetails();
	}

}
