import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell", "12345");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", "54321");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        LibraryMember m1 = new LibraryMember("Alice", 1);
        LibraryMember m2 = new LibraryMember("Bob", 2);

        library.addMember(m1);
        library.addMember(m2);

        library.borrowBook(m1, b1);
        library.borrowBook(m2, b2);

        library.reserveBook(m1, b3);
        library.displayReservedBooks(m1);

        library.cancelReservation(m1, b3);
        library.displayReservedBooks(m1);

        library.displayBooks();
    }
}
