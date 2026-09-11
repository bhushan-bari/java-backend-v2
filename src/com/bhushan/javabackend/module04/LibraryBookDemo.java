package com.bhushan.javabackend.module04;

class LibraryBook {

    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean available;

    LibraryBook(int bookId,
                String title,
                String author,
                double price,
                boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void displayBook() {

        System.out.println("Book ID    : " + this.bookId);
        System.out.println("Title      : " + this.title);
        System.out.println("Author     : " + this.author);
        System.out.println("Price      : " + this.price);
        System.out.println("Available  : " + this.available);
        System.out.println();
    }

    public void borrowBook() {

        if (this.available) {

            this.available = false;

            System.out.println(
                    "Book " + this.bookId +
                            " borrowed successfully"
            );

        } else {

            System.out.println(
                    "Book " + this.bookId +
                            " is already borrowed"
            );
        }
    }

    public void returnBook() {

        this.available = true;

        System.out.println(
                "Book " + this.bookId +
                        " returned successfully"
        );
    }

    public void updatePrice(double price) {

        if (price > 0) {

            this.price = price;

            System.out.println(
                    "Price updated successfully"
            );

        } else {

            System.out.println("Invalid price");
        }
    }
}

public class LibraryBookDemo {

    public static void main(String[] args) {

        LibraryBook book1 =
                new LibraryBook(
                        101,
                        "Clean Code",
                        "Robert Martin",
                        700,
                        true
                );

        LibraryBook book2 =
                new LibraryBook(
                        102,
                        "Effective Java",
                        "Joshua Bloch",
                        900,
                        true
                );

        System.out.println("INITIAL BOOK DETAILS");
        System.out.println("--------------------");

        book1.displayBook();
        book2.displayBook();

        book1.borrowBook();

        book1.borrowBook();

        book1.returnBook();

        book2.updatePrice(1000);

        System.out.println();
        System.out.println("FINAL BOOK DETAILS");
        System.out.println("------------------");

        book1.displayBook();
        book2.displayBook();
    }
}