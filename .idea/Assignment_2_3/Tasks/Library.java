import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" added to the library.");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.println("Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() +
                    "\", Year: " + book.getYear() + ", Rating: " + book.getRating());
        }
    }

    // Find books by author
    public void findBooksByAuthor(String author) {
        boolean found = false;
        System.out.println("Books by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getYear());
                found = true;
            }
        }
        if (!found) System.out.println("No books found by " + author);
    }

    // Check availability
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return true;
        }
        return false;
    }

    // Borrow a book
    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed \"" + title + "\".");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not available.");
    }

    // Return a book
    public void returnBook(String title, User user) {
        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.returnBook(book);
                books.add(book);
                System.out.println(user.getName() + " returned \"" + title + "\".");
                return;
            }
        }
        System.out.println(user.getName() + " does not have \"" + title + "\".");
    }

    // Add a user
    public void addUser(User user) {
        users.add(user);
        System.out.println("User \"" + user.getName() + "\" registered.");
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No registered users.");
            return;
        }
        System.out.println("Library Users:");
        for (User user : users) {
            System.out.println("- " + user.getName() + ", Age: " + user.getAge());
        }
    }

    // Rating and reviews
    public void rateBook(String title, double rating) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setRating(rating);
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found to rate.");
    }

    public void reviewBook(String title, String review) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.addReview(review);
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found to review.");
    }

    public void displayBookReviews(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayReviews();
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found.");
    }

    // Library statistics
    public double getAverageBookRating() {
        if (books.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Book book : books) sum += book.getRating();
        return sum / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) return null;
        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }
}
