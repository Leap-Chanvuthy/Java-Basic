import java.util.Scanner;
import javax.lang.model.element.ModuleElement.UsesDirective;
public class Lab9 {
    public static void main(String[] args) throws Exception{
        String fullname , address;
        int age;
        Scanner userInput = new Scanner(System.in);
            System.out.println("Fill your fullname : ");
            fullname = userInput.nextLine();
            System.out.println("Your age : ");
            age = userInput.nextInt();
            userInput.nextLine();
            System.out.println("Fill your address : ");
            address = userInput.nextLine();
            
            System.out.println("");

            System.out.println("Your fullname is : " + fullname);
            System.out.println("Your address is : " + address);
            System.out.println("Your age is : " + age);
    }
}
