package polymorphism;

public class MathOperations {

	public static void add(int x, int y){
		int sum;
		sum = x+y;
		System.out.println("Sum value for int and int ::"+sum);
		
	}
	public static void add(int x, float y){
		float sum = x+y;
		System.out.println("Sum value for int and float ::"+sum);
	}
	
	public static void add (float x, float y){
		float sum = x+y;
		System.out.println("Sum value for float and float  ::"+sum);
	}
	
	
}
