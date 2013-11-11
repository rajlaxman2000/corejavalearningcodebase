package Basics;


public class HelloWorld {
	
	public HelloWorld(){
		System.out.println("I am default");
	}
	
	public static void main(String[] args) {
		/*System.out.println("Hello Java world");
		Test test = new Test("I am creating the class called test");
		System.out.println(args);
		test.add(1,5);
		*/
		//args = null;
		/*System.out.println("args value in toString ::"+args.toString());
		System.out.println("args value in Class ::"+args.getClass());
		System.out.println("args value ::"+args);
		
		String name;
		// Ram is good boy.
		name = new String("Rajesh");
		
		//System.out.println(name.contains("je"));
		 * 497, 447, 
		*/
		
		Integer newIntValue;
		newIntValue= Integer.parseInt("khs");
		
		
		Student.testmethod();
		
		//Integer.pa
		
		System.out.println(newIntValue.intValue());
		
	
		
		//System.out.println(x.doubleValue());
		
		/*
		 * public, private, procted, default
		 * 
		 *  class
		 *  method
		 *  variable
		*/
		
		//Auto Type conversion ::: Auto boxing
				
		short l =5;
		int a= 65535;
			
		
		l = (short)a;
		
		
		//System.out.println(l);
		
		Integer x = new Integer(7);
		
		//System.out.println(x);		
		Short y = new Short((short)10);
		//System.out.println(y);
		//Student student = new Student(1);
		int ab[] ={1,2};
		
		ab[0] = 10;
		ab[1] = 20;
		
		//System.out.println(ab);
		
	}	
}
