public class RectangleAdapter implements Shape, NameShaped{
        private Rectangle rectangle;

        public RectangleAdapter(Rectangle r) {
            rectangle = r;
        }

        public double getArea() {
            return rectangle.getArea();
        }

        public String getName()
        {return "rectangle";}
    }


