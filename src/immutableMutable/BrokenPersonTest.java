package immutableMutable;

import java.util.Date;

public class BrokenPersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date myDate = new Date();
		
		System.out.println("************** Showing the broken person ***************");
		BrokenPerson myPerson = new BrokenPerson( "David", "O'Meara", myDate );
		System.out.println( myPerson.getDOB() );
		myDate.setMonth( myDate.getMonth() + 1 );
		System.out.println( myPerson.getDOB() );
	
		System.out.println("************** Showing the better person ***************");
		BetterPerson myBetterPerson = new BetterPerson( "David", "O'Meara", new Date() );
		System.out.println( myBetterPerson.getDOB() );
		Date myDate1 = myBetterPerson.getDOB();
		myDate1.setMonth( myDate1.getMonth() + 1 );
		System.out.println( myBetterPerson.getDOB() );
		
		//http://www.javaranch.com/journal/2003/04/immutable.htm
		

	}

}
