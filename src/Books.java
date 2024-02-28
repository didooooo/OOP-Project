import java.util.HashSet;
import java.util.Set;

public abstract class Books {
    private Author author;
    private String title;
    private String genre;
    private String description;
    private Set<String> tags = new HashSet<>();
    private double rating;
    private String isbn;

    public Books(Author author, String title, String genre, String description, Set<String> tags, double rating, String isbn) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.tags = tags;
        this.rating = rating;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getTags() {
        return tags;
    }

    public double getRating() {
        return rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
