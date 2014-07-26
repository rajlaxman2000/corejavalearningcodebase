package basicstest;

public class SubClass extends SuperClass {
	int i = 12;

	public void printValue() {
		System.out.println("Value-B");
	};

	public int doIt(String str, Integer... data)  {
		String signature = "(String, Integer[])";
		System.out.println("Overridden: " + str + " " + signature);
		return 0;
	}

}
