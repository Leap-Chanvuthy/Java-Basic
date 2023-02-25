package Ex7;
import java.util.Scanner;

public class BookExe {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        //int ArrayOfBook[] = new int[BookSize];
            Book Book [] = new Book[5];
                Book Book1 = new Book();
                Book Book2 = new Book();
                Book Book3 = new Book();
                Book Book4 = new Book();
                Book Book5 = new Book();
                System.out.println("Fill Book info : ");
                    System.out.print("Book title : ");
                    Book1.title = userInput.nextLine();
                    System.out.print("Book author : ");
                    Book1.author = userInput.nextLine();
                    System.out.print("Book isbn : ");
                    Book1.isbn = userInput.nextLine();
                    System.out.print("Book publish year : ");
                    Book1.publishYear = userInput.nextLine();

                    System.out.println("=============================");

                    System.out.print("Book title : ");
                    Book2.title = userInput.nextLine();
                    System.out.print("Book author : ");
                    Book2.author = userInput.nextLine();
                    System.out.print("Book isbn : ");
                    Book2.isbn = userInput.nextLine();
                    System.out.print("Book publish year : ");
                    Book2.publishYear = userInput.nextLine();

                    System.out.println("=============================");

                    System.out.print("Book title : ");
                    Book3.title = userInput.nextLine();
                    System.out.print("Book author : ");
                    Book3.author = userInput.nextLine();
                    System.out.print("Book isbn : ");
                    Book3.isbn = userInput.nextLine();
                    System.out.print("Book publish year : ");
                    Book3.publishYear = userInput.nextLine();

                    System.out.println("=============================");

                    System.out.print("Book title : ");
                    Book4.title = userInput.nextLine();
                    System.out.print("Book author : ");
                    Book4.author = userInput.nextLine();
                    System.out.print("Book isbn : ");
                    Book4.isbn = userInput.nextLine();
                    System.out.print("Book publish year : ");
                    Book4.publishYear = userInput.nextLine();

                    System.out.println("=============================");

                    System.out.print("Book title : ");
                    Book5.title = userInput.nextLine();
                    System.out.print("Book author : ");
                    Book5.author = userInput.nextLine();
                    System.out.print("Book isbn : ");
                    Book5.isbn = userInput.nextLine();
                    System.out.print("Book publish year : ");
                    Book5.publishYear = userInput.nextLine();

                    System.out.println("=============================");

                    System.out.println("Book info : ");

                    for (int i = 0 ; i < 5 ; i++){
                        Book [i].getInfo();
                    }

    }
}
