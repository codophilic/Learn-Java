// High Cohesion Example
 
// This class is responsible only for managing books.
class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
 
    public String getTitle() {
        return title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
 
// This class is responsible only for library management tasks.
class Library {

    static i=0;
    Book books = new Book[5];
 
    public void addBook(Book book) {
        books[i]=book 
        i++;
    }
 
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}



public class AboutCohesion{
    public static void main(String args[]){

    }
}