public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Add books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println();

        // Register users
        User user1 = new User("Alice", 22);
        User user2 = new User("Bob", 25);
        library.addUser(user1);
        library.addUser(user2);
        System.out.println();

        library.displayUsers();
        System.out.println();

        // Borrow books
        library.borrowBook("Data Structures and Algorithms", user1);
        library.borrowBook("The Art of Fiction", user2);
        System.out.println();

        user1.displayBorrowedBooks();
        user2.displayBorrowedBooks();
        System.out.println();

        // Return books
        library.returnBook("Data Structures and Algorithms", user1);
        user1.displayBorrowedBooks();
        System.out.println();

        library.displayBooks();
        System.out.println();

        // Ratings and Reviews
        library.rateBook("Introduction to Java Programming", 4.5);
        library.reviewBook("Introduction to Java Programming", "Very helpful for beginners.");
        library.displayBookReviews("Introduction to Java Programming");
        System.out.println();

        // Library statistics
        System.out.println("Average Book Rating: " + library.getAverageBookRating());
        Book mostReviewed = library.getMostReviewedBook();
        if (mostReviewed != null) {
            System.out.println("Most Reviewed Book: \"" + mostReviewed.getTitle() + "\" with " + mostReviewed.getReviews().size() + " reviews");
        }
    }
}
