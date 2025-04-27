/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You borrowed the book: " + title);
        } else {
            System.out.println("The book is not available.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("You returned the book: " + title);
    }
}
