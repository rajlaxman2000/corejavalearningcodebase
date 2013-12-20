package polymorphism;

public class Employee implements GeneralEmployeeInt{
	
	int empId;
	String empName;
	int empAge;
	
	public void printEmpDetails(int empId){
		System.out.println("I am printing the employee details this is common for all");
	}
	
	public void printEmpPreviligies(int empId){
		System.out.println("This is basic employee rpevilige method, decide if u wan tot use it or not");		
	}
	

}
