package exceptions;

public class ExceptionsThrow {
	
	public static void main(String[] args){
		try {
			System.out.println(samplecall("Raghu"));
			System.out.println(samplecall("Rajesh"));
			
			System.out.println(samplecall("Ramesh"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally{
			System.out.println("I am at final bloack");
		}	
		
		System.out.println("I am at the end of the class, out of try catch block");
		
	}

	public static String samplecall(String name) throws NumberFormatException{
		
		if(name.equalsIgnoreCase("Rajesh")){
			throw new NumberFormatException("I am meeting the condition, so throwing exception");
		}
		
		return "I am fine, you can proceeed further:::"+name;		
	}
}
