package singleton.examples;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student=null;
		
		Employee.getEmployeeObject();
		
		Employee.getEmployeeObject();
		
		Employee.getEmployeeObject();
		
		
		Parent parent = new Parent();
		

		
		try {
			Class.forName("Parent").newInstance();
			
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		student.getStudent();
		try {
			student.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
