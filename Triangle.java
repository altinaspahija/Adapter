public class Triangle {
    private double height;
    private double base;
    public Triangle (double h, double b)
    {
        height = h;
        base = b;
    }

    public double computeArea() {
        return (height*base)/2;
    }
}
