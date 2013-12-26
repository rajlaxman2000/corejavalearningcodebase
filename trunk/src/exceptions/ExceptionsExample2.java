package exceptions;

public class ExceptionsExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		int z=0;
		try {
			System.out.println(x+" divided by"+y+"---"+x/y);
			//System.out.println(x+" divided by"+z+x/z);
			
			String numStr="1234";
			String notNumStr="rajesh";
			
			Integer l = Integer.valueOf(numStr);
			Integer m = Integer.valueOf(notNumStr);
			
			System.out.println("L =="+l);
			System.out.println("M =="+m);
			
		}catch (Exception ex) {
			System.err.println("I facing number format problem");
			System.err.println(ex.getMessage());
		}finally{
			System.out.println("I am at the end of the program");
		}
		
		System.out.println("I am out of all the blocks");
		
		
		//complete -ref : 218
		/*
		try, catch, finally, 
		throws
		throw*/
		
	}

}
