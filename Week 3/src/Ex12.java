import java.util.Scanner;

public class Ex12 {
    
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        int array [][] = new int [3][3];
            System.out.println("Enter 9 elements for 2D array : ");
            for (int row = 0 ; row < array.length ; row++){
                for (int col = 0 ; col < array[row].length ; col++){
                    array [row][col] = userInput.nextInt();
                }
                System.out.println();
            }

            System.out.println("Display array : ");
                for (int i = 0 ; i < array.length ; i++){
                    for (int j = 0 ; j < array[i].length ; j++){
                        System.out.print(array[i][j]);
                    }
                    System.out.println( " ");
                }
    }
    
}
