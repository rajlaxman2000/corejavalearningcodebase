package interFaceAbstart;


public class Sampletest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
	DirectorClass directorClass = new DirectorClass();
	long empId = 10;
	
	EmployeeDetails empObj = directorClass.getEmployeeDetials(empId);
	
	//GenricEmployee.getEmployeeDetials(empId);
	
	System.out.println("Emp Id:"+empObj.getId());
	System.out.println("Emp name:"+empObj.getName());
	System.out.println("Emp age:"+empObj.getAge());
	
	/* ----------------- */
	//Employe1  employe1 = new Employe1();
	
	//employe1.age = 15;
	
	
	
	

	}

}
