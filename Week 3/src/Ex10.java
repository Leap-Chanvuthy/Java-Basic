import java.util.Scanner;
import java.util.zip.ZipEntry;
import org.w3c.dom.UserDataHandler;
public class Ex10 {
    static void findAvg (int array []){
            System.out.println(" ---- ");
            for (int i = 0 ; i < array.length ; i++){
                System.out.println(array[i]);
            }
            int sum = 0 , average;
            for (int i = 0 ; i < array.length ; i++){
                sum = sum + array[i];
            }
            average = sum / array.length;
            System.out.println("Average array is : " + average);
    }
    static void findMax(int array[]){
        int i;
        int max = array[0];
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
            System.out.println("Maximum array is : " + max);    
    }
    static void findMin (int array[]){
        int i;
        int min = array[0];
        for (i = 1; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
            System.out.println("Minimum array is : " + min);    
    }
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
            System.out.println("A. Find Average array ");
            System.out.println("Enter size of array : ");
            int sizeA = userInput.nextInt();
            int arrayA [] = new int[sizeA];
                System.out.println(" Enter " + sizeA + " elements : ");
                for (int i = 0 ; i < sizeA ; i++){
                    arrayA[i] = userInput.nextInt();  
                }
                findAvg(arrayA);

            System.out.println("B. Find Maximum array ");
            System.out.println("Enter size of array : ");
            int sizeB = userInput.nextInt();
            int arrayB [] = new int[sizeB];
                System.out.println(" Enter " + sizeB + " elements : ");
                for (int i = 0 ; i < sizeB ; i++){
                    arrayB[i] = userInput.nextInt();  
                }
                findMax(arrayB);

            System.out.println("C. Find Minimun array ");
            System.out.println("Enter size of array : ");
            int sizeC = userInput.nextInt();
            int arrayC [] = new int[sizeC];
                System.out.println(" Enter " + sizeC + " elements : ");
                for (int i = 0 ; i < sizeC ; i++){
                    arrayC[i] = userInput.nextInt();  
                }
                findMin(arrayC);      
    }
    
}
