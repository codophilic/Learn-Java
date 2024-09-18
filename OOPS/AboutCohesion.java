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
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor());
    }
}
 
// This class is responsible only for library management tasks.
class Library {

    static int i=0;
    static Book books[] = new Book[5];
 
    public void addBook(Book book) {
        books[i]=book;
        i++;
    }
 
    public void displayAllBooks() {
        for (int j=0;j<i;j++) {
            books[j].displayBookDetails();
        }
    }
}

// Low Cohesion Example
class AllThingsInOneClass {
    
    static int bookCounter=0;
    static int UserCounter=0;
    String booksName[] = new String[5];
    String booksAuthor[] = new String[5];
    String Users[] = new String[5];
    
    // Book Management Responsibility
    public void addBook(String name,String author) {
        booksName[bookCounter]=name;
        booksAuthor[bookCounter]=author;
        bookCounter++;
    }

    public void displayAllBooks() {
        for (int i=0;i<bookCounter;i++) {
            System.out.println("Title: " + booksName[i] + ", Author: " + booksAuthor[i]);
        }
    }

    // User Management Responsibility (Unrelated to books)
    public void addUser(String user) {
        Users[UserCounter]=user;
        UserCounter++;
    }

    public void displayAllUsers() {
        for (int i=0;i<UserCounter;i++) {
            System.out.println("User: " + Users[i]);
        }
    }

    // Some unrelated functionality (Unrelated to both books and users)
    public void sendNotification(String message) {
        System.out.println("Sending notification: " + message);
    }
}

public class AboutCohesion{
    public static void main(String args[]){

        // High Cohesion
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        library.displayAllBooks();

        // Low Cohesion
        AllThingsInOneClass allThingsInOneClass = new AllThingsInOneClass();
        
        // Book management
        allThingsInOneClass.addBook("1984", "George Orwell");
        
        // User management
        allThingsInOneClass.addUser("Alice");
        
        // Display all books and users
        allThingsInOneClass.displayAllBooks();
        
        // Unrelated functionality
        allThingsInOneClass.sendNotification("Library will be closed tomorrow.");
    }
}