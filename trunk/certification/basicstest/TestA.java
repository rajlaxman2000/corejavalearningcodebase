package basicstest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestA extends A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		short s = 9;
		// System.out.println(add(s,6));

		/*
		for (int i = 2; i < 4; i++)
			for (int j = 2; j < 4; j++)
				assert i != j : i;

	*/
			File f = new File("a.txt");
			
			System.out.println(f.getPath());
		

	}

}
