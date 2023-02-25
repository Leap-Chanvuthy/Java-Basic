package Ex7;
public class Book {
    public String title;
    public String author;
    public String isbn;
    public String publishYear;
    

    public Book (){

    }
    public Book (String title){
        this.title = title;
    } 
    public  Book (String title, String author){
            this.title = title;
            this.author = author;
    } 
    public  Book (String title, String author , String isbn ){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    } 
    public  Book (String title, String author , String isbn , String publishYear){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    public String getTitle(String title){
        return this.title;
    }
    public String getAuthor (String author){
        return this.author;
    }
    public String getIsbn(String isbn){
        return this.isbn;
    }
    public String getPublishYear (String PublishYear){
        return this.publishYear;
    }

    public void getInfo (){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Isbn : " + isbn);
        System.out.println("Publish year : " + publishYear);
    }
}
