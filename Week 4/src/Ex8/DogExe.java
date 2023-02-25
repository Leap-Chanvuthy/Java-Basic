package Ex8;
import java.util.Scanner;

public class DogExe {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Dog Dogs [] = new Dog [2];
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();
        System.out.print("Fill dog 1 name : ");
            Dog1.name = input.nextLine();
            Dog1.weight = input.nextDouble();
        
        System.out.println("Fill dog 2 name : ");
            Dog2.name = input.nextLine();
            Dog2.weight = input.nextDouble();
            Dogs [0] = Dog1;
            Dogs [1] = Dog2;

            for (Dog dog : Dogs) {
                dog.getInfo();
            }
    }
}
