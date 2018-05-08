package abst;

public class PolyMain {

	public static void main(String[] args) {
		/**
		GeometricFigure gf = new Rectangle(10, 20);
		System.out.println(gf.areaToPerimeterRatio());
		gf = new Rectangle(1, 2);
		System.out.println(gf.areaToPerimeterRatio());
		gf = new Rectangle(5, 5);
		System.out.println(gf.areaToPerimeterRatio());
		gf = new Circle(1);
		System.out.println(gf.areaToPerimeterRatio());

		gf = new Circle(33);
		System.out.println(gf.areaToPerimeterRatio());
		*/
		//Object[]
		GeometricFigure[] optionFigs = {
				new Rectangle(10, 5),
				new Rectangle(7, 7),
				new Triangle(7,7,7),
				new Triangle(7, 7, Math.sqrt(98))
		};
		double bestRatio = Double.MIN_NORMAL;
		GeometricFigure bestFig = null;
		for(GeometricFigure gf : optionFigs) {
			double apr = gf.areaToPerimeterRatio();
			if(apr > bestRatio) {
				bestRatio = apr;
				bestFig = gf;
			}
		}
		System.out.println("Best choice is:" + bestFig);
		for(GeometricFigure gf : optionFigs) {
			if(gf instanceof Object) {
				System.out.println(gf + " isA Object");
			}
			if(gf instanceof Circle) {
				System.out.println(gf + " isA Circle");
				Circle c = (Circle)gf;
			}
			if(gf instanceof Triangle) {
				System.out.println(gf + " isA Triangle");
			}
			if(gf instanceof Rectangle) {
				System.out.println(gf + " isA Rectangle");
			}
		}
		
		Circle c4 = new Circle(3);
		GeometricFigure gf1 = c4;
	}

}
