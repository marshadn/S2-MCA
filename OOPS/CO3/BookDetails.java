/*Write a program has class Publisher, Book, Literature and Fiction
 Read the information and print the details of books from either the category, using inheritance.*/

import java.util.Scanner;

// Class Publisher
class Publisher {
    String publisherName;

    // Constructor to initialize Publisher
    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

// Class Book inherits Publisher
class Book extends Publisher {
    String bookTitle;
    String author;
    double price;

    // Constructor to initialize Book
    public Book(String publisherName, String bookTitle, String author, double price) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

// Class Literature inherits Book
class Literature extends Book {
    String genre;

    // Constructor to initialize Literature
    public Literature(String publisherName, String bookTitle, String author, double price, String genre) {
        super(publisherName, bookTitle, author, price);
        this.genre = genre;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Literature Book Details:");
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

// Class Fiction inherits Book
class Fiction extends Book {
    String genre;

    // Constructor to initialize Fiction
    public Fiction(String publisherName, String bookTitle, String author, double price, String genre) {
        super(publisherName, bookTitle, author, price);
        this.genre = genre;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Enter Publisher Name: ");
            String publisherName = scanner.nextLine();

            System.out.print("Enter Book Title: ");
            String bookTitle = scanner.nextLine();

            System.out.print("Enter Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Genre (Literature/Fiction): ");
            String genre = scanner.nextLine();

            if (genre.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisherName, bookTitle, author, price, genre);
            } else if (genre.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisherName, bookTitle, author, price, genre);
            } else {
                System.out.println("Invalid genre. Please enter either 'Literature' or 'Fiction'.");
                i--; // Decrement to re-enter the details
            }
        }

        System.out.println("\nDetails of Books:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
