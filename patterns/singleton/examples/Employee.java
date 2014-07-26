package singleton.examples;

public class Employee {
	
	private static Employee emp = null;
	
	private Employee(){
		
	}
	
	public static Employee getEmployeeObject(){
		
		if(emp==null){
			emp = new Employee();		
		}
		return emp;
	}

}
