package Basics;

public class SumLogicTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//SumLogic logic = new SumLogic(n, c);
		
		//SumLogic logic = new SumLogic(5, 2);
		// 0 + 1 + 2 + 6 + 12 = 21
		
		//SumLogic logic = new SumLogic(5, 3);
		// 0 + 1 + 2 + 6 + 24 = 33
		
		//SumLogic logic = new SumLogic(10, 3);
		// 0 + 1 + 2 + 6 + 24 + 60 + 120 + 210 + 336 + 504  = 33
		//SumLogic logic = new SumLogic(100 , 10);
		
		SumLogic logic = new SumLogic(100000 , 200);
		
		System.out.println(logic.findSum());

	}

}
