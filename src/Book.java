import java.util.HashSet;
import java.util.Set;

public class Book extends Books{
    public Book(Author author, String title, String genre, String description, Set<String> tags, double rating, String isbn) {
        super(author, title, genre, description, tags, rating, isbn);
    }

}
