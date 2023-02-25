import java.util.Scanner;

public class Ex9 {
    public static void main (String [] args){
       
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter size of array : ");
            int size = userInput.nextInt();
            int arr [] = new int[size];
                System.out.println("Enter element : ");
                for (int i = 0 ; i < size ; i++){
                    arr[i] = userInput.nextInt();
                }

                System.out.println("Printed array : ");
                for (int i = 0 ; i < size ; i++){
                    System.out.println(arr[i]);
                }
            
            
    }
}
