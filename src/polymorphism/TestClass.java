package polymorphism;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int x = 10;
		float y = (float) 2.0;
		float z = (float) 20.0;
		MathOperations.add(x, 2);
		MathOperations.add(x, y);
		MathOperations.add(y, z);
		*/
		
		//Director director = new Employee();
		GeneralEmployeeInt  emp = new Director();
		GeneralEmployeeInt  emp1 = new Employee();
		
		GeneralEmployeeInt splEmpObj=new Director();
		
		//emp.printEmpDetails(20);
		//emp.printEmpPreviligies(20);
		

		//emp1.printEmpDetails(20);
		//emp1.printEmpPreviligies(20);
		
		splEmpObj.printEmpDetails(10);
		
		
		C obj = new C();		
		obj.printA();
		obj.printB();
		obj.printC();	
		
	}

}
