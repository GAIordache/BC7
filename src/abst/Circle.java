package abst;

public class Circle extends GeometricFigure {
	private final double mRadius;
	
	public Circle(double pRadius) {
		mRadius = pRadius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*mRadius;
	}

	@Override
	public double getArea() {
		return Math.PI*mRadius*mRadius;
	}

	public double getRadius() {
		return mRadius;
	}

	@Override
	public String toString() {
		return "Circle [mRadius=" + mRadius + "]";
	}
	
	

}
