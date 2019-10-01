public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArenal()*getHeight();
    }
    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + "A Cylinder with height="
                + getHeight()
                + ", which is a subclass of"
                + super.toString();
    }
}
