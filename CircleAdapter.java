// Adapter  : CircleAdapter
// Adaptee	: Circle
// Target 	: Shape

public class CircleAdapter implements NameShaped {
	private Circle circle;

	public CircleAdapter(Circle c) {
		circle = c;
	}

	public double getArea() {
		return circle.computeArea();
	}

	public String getName(){return "circle";}

}