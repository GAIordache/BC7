package abst;

public class Rectangle extends GeometricFigure {
	private final double mWidth;
	private final double mHeight;

	public Rectangle(double pWidth,double pHeight) {
		this.mWidth = pWidth;
		this.mHeight = pHeight;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * mWidth + 2 * mHeight;
	}
	
	@Override
	public double getArea() {
		return mWidth*mHeight;
	}

	@Override
	public String toString() {
		return "Rectangle [mWidth=" + mWidth + ", mHeight=" + mHeight + "]";
	}
	
	
	
}
