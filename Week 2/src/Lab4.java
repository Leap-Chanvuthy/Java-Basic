import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) throws Exception{
        double meter , feet;
        Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your meter :");
            meter = userInput.nextDouble();
            feet = meter * 3.3;
            System.out.println("Lenght is feet is :" + feet + "feets");
    }
}
