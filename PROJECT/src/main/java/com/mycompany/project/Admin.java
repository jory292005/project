import com.mycompany.project.LibrarySystem;

public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    public void addBook(LibrarySystem library, Book book) {
        library.addBook(book); 
        System.out.println("Admin added a new book: " + book.getTitle());
    }
}
