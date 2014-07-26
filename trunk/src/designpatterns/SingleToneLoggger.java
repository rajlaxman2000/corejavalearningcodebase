package designpatterns;

public class SingleToneLoggger {
	
	// this creates the actual Singleton instance
	private static final SingleToneLoggger singletonInstance = new SingleToneLoggger();

	/* Private constructor prevents others from
	   instantiating this class: */
	private SingleToneLoggger(){
	}

	// this method returns the singleton instance
	public static SingleToneLoggger getSingleton(){ 
	  return singletonInstance; 
	}

	/* This will print a message to the screen:
	   sample call: Logging.getSingleton().log("testing message");
	*/

	public void log(String message){
	  System.out.println( System.currentTimeMillis()+ ": " + message );
	}

}
