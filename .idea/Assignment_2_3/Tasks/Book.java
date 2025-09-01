import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void displayReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews for \"" + title + "\".");
        } else {
            System.out.println("Reviews for \"" + title + "\":");
            for (String r : reviews) {
                System.out.println("- " + r);
            }
        }
    }
}
