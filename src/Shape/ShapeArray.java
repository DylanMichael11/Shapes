package Shape;

public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate the shapes
        Shape sphere = new Sphere(5);         // Example radius = 5
        Shape cylinder = new Cylinder(3, 7);  // Example radius = 3, height = 7
        Shape cone = new Cone(3, 7);          // Example radius = 3, height = 7

        // Store the instances in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print each shape's data
        for (Shape shape : shapeArray) {
            System.out.println(shape);
            System.out.println();
        }
    }
}
