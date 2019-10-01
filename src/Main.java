public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle( 3.5,"indigo");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5, 3.5, "indigo");
        System.out.println(cylinder);
    }
}
