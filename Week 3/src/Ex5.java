import java.util.Scanner;

public class Ex5 {

    static int isPrime(int number){
        int i , f = 0;
            
            if (number == 0 || number == 1)
                f = 1;
                for (i = 0 ; i <= number / 2 ; i++){
                    if (number % i == 0){
                        f = 1 ;
                        break;
                    }
                    if (f == 0){
                        System.out.println("This is a prime number");
                    } else{
                        System.out.println("This is not a prime number");
                    }

                }
                return 0;
    }
    public static void main (String [] args){
        
        System.out.println("Enter a positive number : ");
            Scanner userInput = new Scanner(System.in);
            int n = userInput.nextInt();
                isPrime(n);

    }
}
