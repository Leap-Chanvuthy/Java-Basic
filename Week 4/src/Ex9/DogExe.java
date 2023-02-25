package Ex9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogExe {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Dog Dogs [] = new Dog[5];
        Dog Dog1 = new Dog();
        System.out.print("Dog 1 name : ");
        Dog1.name = input.nextLine();
        System.out.print("Dog 1 Weight : ");
        Dog1.weight = input.nextDouble();

        System.out.println("=================");

        Dog Dog2 = new Dog();
        System.out.print("Dog 2 name : ");
        Dog2.name = input.nextLine();
        System.out.print("Dog 2 Weight : ");
        Dog2.weight = input.nextDouble();

        System.out.println("=================");
        
        Dog Dog3 = new Dog();
        System.out.print("Dog 3 name : ");
        Dog3.name = input.nextLine();
        System.out.print("Dog 3 Weight : ");
        Dog3.weight = input.nextDouble();

        System.out.println("=================");
        
        Dog Dog4 = new Dog();
        System.out.print("Dog 4 name : ");
        Dog4.name = input.nextLine();
        System.out.print("Dog 4 Weight : ");
        Dog4.weight = input.nextDouble();

        System.out.println("=================");
        
        Dog Dog5 = new Dog();
        System.out.print("Dog 5 name : ");
        Dog5.name = input.nextLine();
        System.out.print("Dog 5 Weight : ");
        Dog5.weight = input.nextDouble();

        for (Dog dog : Dogs) {
            dog.getInfo();
        }
       
        

      
    }
}
