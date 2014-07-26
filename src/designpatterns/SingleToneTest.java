package designpatterns;

public class SingleToneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SingleToneLoggger singleToneLoggger = null;
		singleToneLoggger.getSingleton().log("This has been generated through single ton");
		
		SingleTone singleTone = null;
		System.out.println(singleTone.getInstance().toString());

	}

}
