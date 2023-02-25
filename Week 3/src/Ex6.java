import java.util.Scanner;

public class Ex6 {

    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        int number = 0;
            while (number != Math.random() * 10){
                System.out.println("Quest a number among 10 ");
                number = userInput.nextInt();
                    if(number == Math.random() * 10){
                        System.out.println("Congrat you quested a correct number !!!");
                    }
            }
            
    }
    
}
