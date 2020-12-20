public class TriangleAdapter implements Shape, NameShaped {
        private Triangle triangle;

        public TriangleAdapter(Triangle t) {
            triangle = t;
        }

        public double getArea() {
            return triangle.computeArea();
        }

        public String getName(){return "triangle";}
    }

