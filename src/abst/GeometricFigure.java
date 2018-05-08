package abst;

public abstract class GeometricFigure {
	abstract public double getPerimeter() ;
	abstract public double getArea() ;
	
	
	public double areaToPerimeterRatio() {
		double perimeter = getPerimeter();
		if(perimeter == 0) {
			return -1;
		}
		double scalingFactor = 1/perimeter;
		double area = getArea();
		return area*scalingFactor*scalingFactor;
	}
}
