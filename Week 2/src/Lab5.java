import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) throws Exception{
        double kilogram , pound;
        Scanner userInput = new Scanner(System.in);
            System.out.println("Enter kilogram :");
            kilogram = userInput.nextDouble();
            pound = kilogram * 2.2;
            System.out.println(kilogram + "kg" + " to poud is : " + pound);
    }
}
