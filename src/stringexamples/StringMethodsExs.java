package stringexamples;

public class StringMethodsExs {
	
	public static void main(String[] args){
		
		String name = "Rajesh Reddy is a teacher";
		String name1 = "  Rajesh Reddy is a teacher   ";
		String name3 = name;
		String name2="1234";
		
		String emailregEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		boolean res  = name.equals(name1.trim());
		System.out.println(name.hashCode());
		System.out.println(name1.trim().hashCode());		
		System.out.println(name==name1);		
		System.out.println(res);
		
		StringBuilder  strBuilder = new StringBuilder("Rajesh Reddy");
		
		strBuilder.append(" is a software").append(" Engineer");
		
		System.out.println(strBuilder.toString());
		//System.out.println(name);
		//System.out.println(name.replaceFirst("R", "--"));
		
	/*	System.out.println(name.charAt(10));
		if(name2.matches("\\d+"))			
			System.out.println(Integer.valueOf(name2));
		
		if(name!=null && name2!=null)
			System.out.println(name.compareTo(name2));
		String numbRegEx="\\d+";
		
		boolean res = name2.matches("\\d+");
		System.out.println(res);
		
		System.out.println(name.compareToIgnoreCase(name1));
		
		System.out.println(name2.isEmpty());
		
		System.out.println(name.contains("i"));
		
		System.out.println(name);
		*/
		
	}

}
