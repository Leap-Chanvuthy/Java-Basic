import java.util.Scanner;

public class Lab7 {
            
    public static void main(String[] args) throws Exception{
        int x , y , tmp;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter x :");
        x = userInput.nextInt();
        System.out.println("Enter y :");
        y = userInput.nextInt();
            tmp = x;
            x = y;
            y = tmp;
            
            System.out.println("x -> y is " + x);
            System.out.println("y -> x is :" + y);


    }
}
