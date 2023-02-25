public class App {
    public static void main(String[] args) throws Exception {
         // create two Point objects
         Point point1 = new Point(1, 2);
         Point point2 = new Point(3, 4);
         
         // create two Line objects
         Line line1 = new Line(point1, point2);
         Line line2 = new Line(new Point(5, 6), new Point(7, 8));
         
         // print the coordinates of the two Line objects
         System.out.println("Line 1: (" + line1.getP1().getX() + "," + line1.getP1().getY() +
             ") - (" + line1.getP2().getX() + "," + line1.getP2().getY() + ")");
         System.out.println("Line 2: (" + line2.getP1().getX() + "," + line2.getP1().getY() +
             ") - (" + line2.getP2().getX() + "," + line2.getP2().getY() + ")");
    }
}
