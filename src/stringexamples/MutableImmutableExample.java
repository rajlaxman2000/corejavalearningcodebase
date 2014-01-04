package stringexamples;

import java.awt.Point;

public class MutableImmutableExample {
	
	public static void main(String[] args){
		//Example of mutable class
		System.out.println("Mutbale presentation");
		Point myPoint = new Point( 0, 0 );		
    	System.out.println( myPoint );    	
    	myPoint.setLocation( 1.0, 0.0 );    	
    	System.out.println( myPoint );
    	
    	System.out.println("Immutbale presentation");
    	//Example of immutable class
    	String myString = new String( "old String" );
    	System.out.println( myString );
    	String afterModified = myString.replaceAll( "old", "new" );    	
    	System.out.println( myString );
    	
    	System.out.println(afterModified);
    	
    	// Another example   
    	/*
    	String myCache = myString;
    	System.out.println( "equal: " + myString.equals( myCache ) );
    	System.out.println( "same:  " + ( myString == myCache ) );

    	myString = "not " + myString;
    	System.out.println( "equal: " + myString.equals( myCache ) );
    	System.out.println( "same:  " + ( myString == myCache ) );
    	*/
	}

}
