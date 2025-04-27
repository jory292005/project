/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibrarySystem library = new LibrarySystem();
        Admin admin = new Admin("Admin");
        library.registerUser(admin);

        Book book1 = new Book("Java Basics", "Ali", "123");
        Book book2 = new Book("Python for Beginners", "John", "456");
        admin.addBook(library, book1);
        admin.addBook(library, book2);

        System.out.println("Are you Admin or User?");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("Admin")) {
            System.out.println("Admin login...");
            // Admin logic here
        } else if (userType.equalsIgnoreCase("User")) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            User user = new User(name);
            library.registerUser(user);

            System.out.println("Welcome, " + name);

            while (true) {
                System.out.println("1. Show Books");
                System.out.println("2. Borrow Book");
                System.out.println("3. Return Book");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    library.showBooks();
                } else if (choice == 2) {
                    System.out.println("Enter the book title to borrow:");
                    String title = scanner.nextLine();
                    for (Book book : library.books) {
                        if (book.getTitle().equals(title)) {
                            user.borrowBook(book);
                            break;
                        }
                    }
                } else if (choice == 3) {
                    System.out.println("Enter the book title to return:");
                    String title = scanner.nextLine();
                    for (Book book : library.books) {
                        if (book.getTitle().equals(title)) {
                            user.returnBook(book);
                            break;
                        }
                    }
                } else if (choice == 4) {
                    System.out.println("Exiting...");
                    break;
                }
            }
        }

        scanner.close();
    }
}
