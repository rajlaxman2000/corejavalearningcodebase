package basicstest;

public class SuperClass {
	int i = 10;

	public void printValue() {
		System.out.println("Value-A");
	};

	public int doIt(String str, Integer... data) throws Exception {
		String signature = "(String, Integer[])";
		System.out.println(str + " " + signature);
		return 1;
	}
}
