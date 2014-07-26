package basicstest;

public class StaticTest {
	{
		System.out.println("block");
	}

	static {
		System.out.println("static");
	}
	
	public StaticTest() {
		System.out.println("A");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StaticTest a = new StaticTest();
		/*
		int i = 011;
		int j = 07;
		System.out.println(i);
		System.out.println(j);
		*/
		
		byte b = 6;
		 b+=8;
		 System.out.println(b);
		 b+=7; // this exclusively means b = (byte) (b+7);
		 // b= b+7;		 
		 System.out.println(b);
		 b= (byte) (b+7);
		 System.out.println(b);

	}

}
