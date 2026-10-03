public class Main {

    interface Plots {
        String getOwner();

        String getShape();

        double getArea();
    }

    static class Circle implements Plots {
        String owner;
        double radius;

        Circle(String owner, double radius) {
            this.owner = owner;
            this.radius = radius;
        }

        @Override
        public String getOwner() {
            return owner;
        }

        @Override
        public String getShape() {
            return "CIRCLE";
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Plots {
        String owner;
        double length;
        double width;

        Rectangle(String Owner, double length, double width) {
            this.owner = Owner;
            this.length = length;
            this.width = width;
        }


        @Override
        public String getOwner() {
            return owner;
        }

        @Override
        public String getShape() {
            return "RECTANGLE";
        }

        @Override
        public double getArea() {
            return length * width;
        }
    }

    static class Triangle implements Plots {
        String owner;
        double height;
        double base;

        public Triangle(String owner, double height, double base) {
            this.owner = owner;
            this.height = height;
            this.base = base;
        }

        @Override
        public String getOwner() {
            return owner;
        }

        @Override
        public String getShape() {
            return "Triangle";
        }

        @Override
        public double getArea() {
            return 0.5 * height * base;
        }
    }

    public static void main(String[] args) {
        Plots p1 = new Circle("Asha", 5);
        Plots p2 = new Rectangle("Ravi", 4, 6);
        Plots p3 = new Triangle("Neha", 10, 3);

        System.out.println(p1.getOwner() + " (" + p1.getShape() + ") " + p1.getArea());
        System.out.println(p2.getOwner() + " (" + p2.getShape() + ") " + p2.getArea());
        System.out.println(p3.getOwner() + " (" + p3.getShape() + ") " + p3.getArea());

        double total = 0;
        total += p1.getArea() + p2.getArea() + p3.getArea();
        System.out.println(total);
    }
}