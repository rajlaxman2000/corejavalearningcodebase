package basicstest;

public class SuperSubClassTest {
	
	public static void main(String[] args){
		SuperClass class1 = new SubClass();
		// SubClass class1 = (SubClass) new SuperClass(); cast exception
		
		System.out.println(class1.i);
		class1.printValue();
		
		SubClass obj =  (SubClass)class1;
		
		
		System.out.println(obj.i);
		obj.printValue();
		
		
		SuperClass ref = new SubClass();
		
		
			try {
				ref.doIt("hello", 3,3,3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
