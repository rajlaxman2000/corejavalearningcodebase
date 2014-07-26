package singleton.examples;

public class Student {
	
	public static Student instance = null;
	
	private Student(){
		
	}
	
	public static Student getStudent(){
		
		if (instance == null) {
			// This sync block will help you to avoid race (multi thread) headache of request
            synchronized(Student.class) {
                if (instance == null) {
                	instance =  new Student();
                }
            }
        }
		
		return instance;
	}

	/**
	 * This will avoid cloning of object so there will be no way to create object even from clone concept 
	 */
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
