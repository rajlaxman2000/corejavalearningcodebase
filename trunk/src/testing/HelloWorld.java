package testing;

import corejava.Student;

public class HelloWorld {

	final static int x=10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Java World");
		Student student = new Student();
		
		
		//student.equals(obj);
		System.out.println("Get class out put :: "+student.getClass());
		System.out.println("Get hashCode out put ::"+student.hashCode());		
		System.out.println("Get toString out put ::"+student.toString());
	
	}

}
