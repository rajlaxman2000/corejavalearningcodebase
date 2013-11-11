package interFaceAbstart;

public class GenricEmployee {

	public EmployeeDetails getEmployeeDetials(long empId){
		
		EmployeeDetails empObj = new EmployeeDetails();		
		
		empObj.setAge(10);
		empObj.setId(empId);
		
		return empObj;		
	}
	

}
