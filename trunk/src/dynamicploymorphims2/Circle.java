package dynamicploymorphims2;

public class Circle implements Shape {

	@Override
	public double area(double dim) {
		double area = 3.14*(dim*dim);
		return area;
	}

}
