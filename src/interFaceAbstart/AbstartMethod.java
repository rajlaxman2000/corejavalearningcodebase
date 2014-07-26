package interFaceAbstart;
/* A class can be abstract or final but can't be both */
//final abstract class Base {
//final class Base {
/* If we keep class as final we can't extend this class with any of the classes*/
class Base {
	  private void fun() {
	     System.out.println("Base fun");    
	  }
	  protected void fun1() {
		     System.out.println("Base fun1");    
	  }
	  
	}

public class AbstartMethod extends Base {
	  	public void fun() {
		     System.out.println("Derived fun"); 
		}
	  	public void fun1() {
		     System.out.println("Derived fun1"); 
		}
		public static void main(String[] args) {
		      Base obj = new AbstartMethod();
		      /* Compile time error, So commenting */
		      //obj.fun();
		      obj.fun1();
		} 
}

	


