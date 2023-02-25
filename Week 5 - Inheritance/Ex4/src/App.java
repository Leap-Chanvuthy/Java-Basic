public class App {
    public static void main(String[] args) {
        // Create array of shapes
        Shape[] shapes = new Shape[5];

        // Create objects from classes and fill the array
        shapes[0] = new Shape();
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new RightTriangle(3.0, 4.0);
        shapes[3] = new Rectangle(2.0, 8.0);
        shapes[4] = new Shape();

        // Loop through the array and print all shapes
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i+1) + ":");
            System.out.println("Area: " + shapes[i].getArea());
            System.out.println("Perimeter: " + shapes[i].getPerimeter());
            System.out.println();
        }
    }
}






