package Basics;

public class PlainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/*
		Plain plain = new Plain();
		Plain plain1 = new Plain();
		
					
		System.out.println(plain.equals(plain1));
		// getClass, toString,equals, hasCode
		*/
		
		Student student1 = new Student();
		student1.id=1;
		student1.name="Rajesh";
		
		Student student2 = new Student();
		student2.id  = 2;
		student2.name = "Ram";
		
		Student student3 = new Student();
		student3.id = 1;
		student3.name = "Rajesh";
		
		Student student4 = new Student(5, "Geetha");
		
		Teacher teacher = new Teacher();
		
		
		System.out.println(student1.equals(student2));
			
	}

}
