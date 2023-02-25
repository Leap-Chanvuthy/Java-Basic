import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) throws Exception{
        double A , r;
        final double PI = 3.14;
        Scanner userInput = new Scanner(System.in);
            System.out.println("Enter circle's radius in cm : ");
            r = userInput.nextDouble();
            A = PI*r*r;
            
            System.out.println("Circle's area is : " + A + " cm");
    }
}
