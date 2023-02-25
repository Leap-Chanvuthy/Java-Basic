package Ex4;
public class RectangleExe {
    public static void main (String [] args){
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2.1;
        rectangle.height = 2.3;
        rectangle.color = "Brown";
        System.out.println("Rectangle width is : " + rectangle.width);
        System.out.println("Rectangle height is : " + rectangle.height);
        System.out.println("Rectangle color is : " + rectangle.color);
        System.out.println("Rectangle area is : " + rectangle.getArea());
        System.out.println("===========================================");
        Rectangle rectangle2 = new Rectangle(1.2 , 1.3 , "Yellow");
        System.out.println("Rectangle 2 width is : " + rectangle2.width);
        System.out.println("Rectangle 2 height is : " + rectangle2.height);
        System.out.println("Rectangle 2 color is : " + rectangle2.color);
        System.out.println("Rectangle 2 area is : " + rectangle2.getArea());

    }
}
