import java.util.Scanner;

//Write a Java program to print 'Hello' on the screen and then print your name on
//a separate line. Expected output:
//Hello
//Sok Sabay

public class Lab1 {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        String yourName;
        System.out.println("Enter your name :");
            yourName = userInput.nextLine();
            System.out.println("Hello " + yourName);
    }
}
