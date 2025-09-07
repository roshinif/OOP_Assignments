package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) { borrowedBooks.add(book); }
    public void returnBook(Book book) { borrowedBooks.remove(book); }

    public void addReservedBook(Book book) { reservedBooks.add(book); }
    public void removeReservedBook(Book book) { reservedBooks.remove(book); }
    public boolean hasReservedBook(Book book) { return reservedBooks.contains(book); }
    public List<Book> getReservedBooks() { return reservedBooks; }

    public String getName() { return name; }
    public int getMemberId() { return memberId; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ")";
    }
}
