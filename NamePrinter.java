public class NamePrinter{
    NameShaped shape;
    public NamePrinter(NameShaped s) {
        shape = s;
    }

    public void nameArea() {
        System.out.print("Shape area : " + shape.getName());
    }
}
