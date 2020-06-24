package homework45;
import java.util.ArrayList;
/**
 * BC12-Morning
 * 6/24/20 18: 06
 */
public class Book {
    public Cover cover;
    private String name;
    private String author;
    private int ISBN;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public Book(String name, int ISBN, Cover cover) {
        this.name = name;
        this.ISBN = ISBN;
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "cover=" + cover +
                ", name='" + name + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

    public Cover getCover() {
        return cover;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}

class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.cover = Cover.SOFTCOVER;

    }
}
