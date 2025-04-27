/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

public class LibrarySystem {
    ArrayList<Book> books;
    ArrayList<User> users;

    public LibrarySystem() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public void showBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
