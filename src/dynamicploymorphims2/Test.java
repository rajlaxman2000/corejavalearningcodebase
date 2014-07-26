package dynamicploymorphims2;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;



public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		double dim = 5;
		
		List<Shape> listofShapes = new ArrayList<Shape>(10);		
		Shape shape = new Circle();
		listofShapes.add(shape);
		shape = new Square();
		listofShapes.add(shape);
		
		System.out.println(getTotArea (listofShapes,dim));

	}
	
	
	public static double getTotArea(List<Shape> listShapes, double dim){
		Iterator<Shape> it = listShapes.iterator();
		double totalArea = 0.0;
		//loop through different shapes
		while(it.hasNext()) {
			Shape s = (Shape) it.next();
			totalArea += s.area(dim); //polymorphic method call
		}
		return totalArea ;		
	}

}
