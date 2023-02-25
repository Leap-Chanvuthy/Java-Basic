import java.util.Scanner;

public class Ex13 {
    public static void main (String [] args){
       
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter size of students : ");
        int size = userInput.nextInt();
        String arr [] = new String[size];
            System.out.println("Enter name : ");
            for (int i = 0 ; i < size ; i++){
                arr[i] = userInput.next();
            }

            System.out.println(" Student in list are : ");
            for (int i = 0 ; i < size ; i++){
                System.out.println(arr[i]);
            }
        
        
}
}
