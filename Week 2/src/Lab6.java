import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) throws Exception{
        int num1 , num2 , result;
        Scanner userInput = new Scanner(System.in);
            System.out.println("Enter number 1 :");
            num1 = userInput.nextInt();
            System.out.println("Enter number 2 :");
            num2 = userInput.nextInt();
            result = num1 + num2;
            System.out.println("The result is :" + result);
    }
}
