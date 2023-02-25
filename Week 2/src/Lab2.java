import java.util.Scanner;

//Write a Java program to print the sum of two numbers. Test data: 30 + 20.
//Expected Output: 50

public class Lab2 {
    public static void main(String[] args) throws Exception{
        int num1 , num2 , result;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first value :");
        num1 = userInput.nextInt();
        System.out.println("Enter second value :");
        num2 = userInput.nextInt();
            result = num1 + num2;
            System.out.println("The result is :" + result);

    }
}
