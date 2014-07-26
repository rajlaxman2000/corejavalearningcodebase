package stringexamples;

public class ReverseString {
	
	public static void main(String[] args){
		String str = new String("Rajesh");
		
		/** Start :: Crude logic**/
		char[] chars1 = new char[str.length()];
		chars1 = str.toCharArray();
		char[] chars2 = new char[str.length()];
		int t=0;
		for (int i=str.length()-1;i>=0;i--){
			chars2[t] = chars1[i];
			t++;
		}
		
		String resultStr = new String();
		//resultStr  =chars2	
		System.out.println("Reverse of the Given String in Crude way ::"+chars2);
		/** End: Crude Logic **/ 
		
		resultStr = reverseIteratively(str);
		System.out.println("Reverse of the Given String using iteratiive loop ::"+resultStr);
		

		resultStr = reverseRecursively(str);
		System.out.println("Reverse of the Given String using recursive loop ::"+resultStr);		
			
		(new ReverseString()).printTest();
	}
	
	public void printTest(){
		System.out.println("I am here");
	}
	
	public static String reverseIteratively(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){			
			sb.append(str.charAt(i));			
		}		
		return sb.toString();
	}
	
	public static String reverseRecursively(String str){
		if(str.length() == 0)
		     return "";
		   return str.charAt(str.length() - 1) + reverseRecursively(str.substring(0,str.length()-1));
	}

}
