package stringexamples;

public class FormatStringExample {
	
	public static void main(String[] args){
		  //Creating Format Strings
        String fs;
        float floatVar = 1l;
        int intVar=10;
        String stringVar ="Rajesh Reddy";
        fs = String.format("The value of the float " +
                           "variable is %f, while " +
                           "the value of the " + 
                           "integer variable is %d, " +
                           " and the string is %s",floatVar, intVar, stringVar);
        
        System.out.println(fs);
	}

}
