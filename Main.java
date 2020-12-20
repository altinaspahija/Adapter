public class Main {
	public static void main(String arg[]) {
		System.out.println("Rectangle ");
		Rectangle rectangle = new Rectangle(2.0, 5.0);
		AreaPrinter cat = new AreaPrinter(new RectangleAdapter(rectangle));
		cat.printArea();
		System.out.println();
		// What about circles?
		// There is an existing class Circle which I want to use
		// since it already calculates the area but
		// It does not implement the Shape interface.
		// Circle class does not have a getArea method
		// (it has a computeArea method).
		System.out.println("Circle ");
		Circle circle = new Circle(3.0);
		AreaPrinter cap = new AreaPrinter(new CircleAdapter(circle));
		cap.printArea();
		System.out.println();
		System.out.println("Triangle ");
		Triangle triangle = new Triangle(2,3);
		AreaPrinter tap = new AreaPrinter(new TriangleAdapter(triangle));
		tap.printArea();
	}
}