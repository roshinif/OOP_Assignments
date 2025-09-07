package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Added member: " + member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book) && !book.isReserved()) {
            member.borrowBook(book);
            books.remove(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available or reserved.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            books.add(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(member.getName() + " did not borrow " + book.getTitle());
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println(member.getName() + " reserved " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println(member.getName() + " canceled reservation for " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " was not reserved by " + member.getName());
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book b : member.getReservedBooks()) {
            System.out.println(" - " + b.getTitle());
        }
    }

    public void displayBooks() {
        System.out.println("Available books in library:");
        for (Book b : books) {
            System.out.println(" - " + b);
        }
    }
}
