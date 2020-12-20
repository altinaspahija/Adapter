public class AreaPrinter {
	private NameShaped shape;

	public AreaPrinter(NameShaped s) {
		shape = s;
	}

	public void printArea() {
		System.out.print("Shape area : " + shape.getArea());
		System.out.print("Shape area : " + shape.getName());
	}
}
