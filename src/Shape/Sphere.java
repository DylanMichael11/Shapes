package Shape;

public class Sphere extends Shape {
    private double radius;

    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method for surface area of a sphere
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method for the volume of a sphere
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // toString to print
    @Override
    public String toString() {
        return "Sphere Surface Area: " + surfaceArea() + "\nSphere Volume: " + volume();
    }
}
