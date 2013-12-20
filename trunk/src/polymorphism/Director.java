package polymorphism;

public class Director extends Employee implements GeneralEmployeeInt {
	
	public void printEmpDetails(int empId){
		System.out.println("Director clas I am printing the employee details this is common for all");
	}
	public void printEmpPreviligies(int empId){
		System.out.println("This is priinting previlages of director only");
	}
	
	

}
