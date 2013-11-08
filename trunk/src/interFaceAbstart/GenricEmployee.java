package interFaceAbstart;

public abstract class GenricEmployee {

	public static EmployeeDetails getEmployeeDetials(long empId){
		
		EmployeeDetails empObj = new EmployeeDetails();		
		
		empObj.setAge(10);
		empObj.setId(empId);
		
		return empObj;		
	}
	

}
