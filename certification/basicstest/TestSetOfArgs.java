package basicstest;

public class TestSetOfArgs {

	public static void printValue(byte... b) {
		System.out.println("long");
	}
	
	public static void printValue(int i, int j, int k) {
		System.out.println("int");
	}


	public static void main(String... args) {
		byte b = 9;
		printValue(b, b, b);
		printValue(b, b, b,b);
	}
}
