package dynamicploymorphims2;

public class Square implements Shape {

	@Override
	public double area(double dim) {
		double area = dim*dim;
		return area;
	}

}
