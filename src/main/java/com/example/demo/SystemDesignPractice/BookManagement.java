package com.example.demo.SystemDesignPractice;
/*
build a system for managing a library's books
 The system should include these features:

Manage Books → Add, remove, or update details of books in the library.
Track Borrowing and Returns → Keep records of who borrowed which book
 and when it was returned.
Search for Books → Allow users to look for books by title, author, or genre.
book has id , author, title, isBorrowed
*/

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    static class Book {
        private int id;
        private String author;
        private String title;
        private boolean isBorrowed;

        public Book(int id, String title, String author, boolean isBorrowed) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isBorrowed = isBorrowed;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }
    }

    static class BookService {
        static List<Book> bookList = new ArrayList<>();

        public void addBooks(int id, String title, String author, boolean isBorrowed) {
            bookList.add(new Book(id, title, author, isBorrowed));
        }


        public void borrowBooks(int bookId) {
            boolean isBorrowedBook = false;
            for (Book book : bookList) {
                if (book.getId() == bookId) {
                    if (book.isBorrowed()) {
                        isBorrowedBook = true;
                        System.out.println("book is already borrowed");
                    } else {
                        book.setBorrowed(true);
                        System.out.println("Book is available to be borrowed");
                        isBorrowedBook=true;
                    }
                }
            }
            if (!isBorrowedBook) {
                System.out.println("book is not available");
            }
        }

        public void searchBooks(int id) {
            boolean isAvailable = false;
            for (Book book : bookList) {
                if (book.getId() == id) {
                    isAvailable = true;
                    System.out.println("Book available");
                }
            }
            if (!isAvailable) {
                System.out.println("Book is not available");
            }
        }

        public void returnBooks(int id) {
            boolean isBookAvailableToReturn=false;
            for(Book book:bookList){
                if(book.getId()==id){
                    isBookAvailableToReturn=true;
                    System.out.println("Book is returned");
                }
            }
            if(!isBookAvailableToReturn){
                System.out.println("book is not available to be returned");
            }
        }
    }


    public static void main(String[] args) {
        BookService library = new BookService();
        library.addBooks(1, "Java Basics", "Ayushi", false);
        library.addBooks(2, "Advanced Java", "Madam Ayushi", false);
//        library.borrowBooks(1);  //("book issued!");
        library.borrowBooks(1);//book is already borrowed!
        library.returnBooks(1);// book returned
        library.searchBooks(4); //null

    }
}
