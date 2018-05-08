package abst;

public class Main {

	public static void main(String[] args) {
		//GeometricFigure gf = new GeometricFigure();
		//System.out.println(GeometricFigure.a);
		//Rectangle r = new Rectangle();
		//r.sayHello();
		Rectangle r1 = new Rectangle(10, 20);
		System.out.println(r1.areaToPerimeterRatio());
		Rectangle r2 = new Rectangle(1, 2);
		System.out.println(r2.areaToPerimeterRatio());
		Rectangle r3 = new Rectangle(5, 5);
		System.out.println(r3.areaToPerimeterRatio());
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(33);
		System.out.println(c1.areaToPerimeterRatio());
		System.out.println(c2.areaToPerimeterRatio());
		Triangle t1 = new Triangle(5, 5, Math.sqrt(50));
		System.out.println(t1.areaToPerimeterRatio());
		Triangle t2 = new Triangle(10, 10, 10);
		System.out.println(t2.areaToPerimeterRatio());
		Triangle t3 = new Triangle(6, 6, Math.sqrt(72));
		System.out.println(t3.areaToPerimeterRatio());
		
		GeometricFigure gf = new Rectangle(2, 2);
		System.out.println(gf.getArea());
		System.out.println(gf.areaToPerimeterRatio());
		
		if(gf instanceof Circle) {
			Circle c60 = (Circle)gf;
			c60.getRadius();
			//Number n = 33.44;
			//if(n instanceof Integer) {
			//	Integer intVar = (Integer)n;
			//}
		}

		Object x = new Circle(33);
		x.hashCode();
		
		//x.getArea(); NU

	}

}
