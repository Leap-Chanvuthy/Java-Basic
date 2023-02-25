package Ex3;
import java.security.PublicKey;
import java.util.concurrent.TimeoutException;

public class Book {
    public String title;
    public String author;
    public String isbn;

    public Book (){

    }
    public Book (String title){
        this.title = title;
    }

    public Book (String title , String author , String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void AllMethodSet(){
        System.out.println("Book title is : " + title);
        System.out.println("Book author is : " + author);
        System.out.println("Book isbn is : " + isbn);
    }
    public String getTitle (){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getIsbn(){
        return this.isbn;
    }

}
