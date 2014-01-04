package exceptions;

public class ThrowsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vh = new Car();
		Car car = new Car();
		try {
			vh.drive(); // At this line we we get flat Tyre exception the it would be a big problem 
			car.drive();
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		

	}

}
