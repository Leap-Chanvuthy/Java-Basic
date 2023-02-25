public class App {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4, 8);
        RightTriangle t1 = new RightTriangle(3, 4);
        
        System.out.println("Circle information:");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println();
        
        System.out.println("Rectangle information:");
        System.out.println("Width = " + r1.getWidth());
        System.out.println("Height = " + r1.getHeight());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        System.out.println();
        
        System.out.println("Right triangle information:");
        System.out.println("Width = " + t1.getWidth());
        System.out.println("Height = " + t1.getHeight());
        System.out.println("Area = " + t1.getArea());
        System.out.println("Perimeter = " + t1.getPerimeter());
    }
}
