package abst;

public class Triangle extends GeometricFigure {
	private final double mL1;
	private final double mL2;
	private final double mL3;

	public Triangle(double pL1, double pL2, double pL3) {
		super();
		mL1 = pL1;
		mL2 = pL2;
		mL3 = pL3;
	}

	@Override
	public double getPerimeter() {
		return mL1 + mL2 + mL3;
	}

	@Override
	public double getArea() {
		double sp = getPerimeter() / 2;
		return Math.sqrt(sp * (sp - mL1) * (sp - mL2) * (sp - mL3));
	}

	@Override
	public String toString() {
		return "Triangle [mL1=" + mL1 + ", mL2=" + mL2 + ", mL3=" + mL3 + "]";
	}

}
