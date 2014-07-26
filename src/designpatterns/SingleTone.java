package designpatterns;

public class SingleTone {
	
	 private static SingleTone instance = null;
	 
	   private SingleTone() {
	      // Exists only to defeat instantiation.
	   }
	   
	   /*
	   protected SingleTone() {	      
	   }
	   */
	   
	   public static SingleTone getInstance() {
	      if(instance == null) {
	         instance = new SingleTone();
	      }
	      return instance;
	   }
	   
	   public String toString(){
		return "I am just toString() method of the given single ton calss";
		   
	   }

}
