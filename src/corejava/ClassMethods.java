package corejava;

public class ClassMethods {
	
	
	
	public static void main(String[] args){
		//System.out.println("Hello");
		//System.out.println(Gingleton.getInstance());
		//System.out.println(isConfusing());
		int x[] = {4,9,3,7,8};
		int y[] = {3,7}; 
		
		Student student = new Student();
		int result = student.findArray(x, y);
		System.out.println(result);
	}
	
	
	/*
	 * Sample Input:
[4,9,3,7,8] and [3,7] should return 2.
[1,3,5] and [1] should return 0.
[7,8,9] and [8,9,10] should return -1.
	 */
	
	
	public static boolean isConfusing() {
		  try {
		    return true;
		  } finally {
		    return false;
		  }
		}

}
