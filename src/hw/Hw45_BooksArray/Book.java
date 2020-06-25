package hw.Hw45_BooksArray;

import static hw.Hw45_BooksArray.BooksList.makeListOfBooks;

/**
 * FirstNewVersion 24.06.2020
 */
public class Book<override> {
    public void main(String[] args) {
        makeListOfBooks();
        System.out.println(toString());
    }

    private String name;
    private int qtyPages;
    private double price;
    public Cover cover;

    public Book() {
    }

    public Book(String name, int qtyPages, double price, Cover cover) {
        this.name = name;
        this.qtyPages = qtyPages;
        this.price = price;
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Kind of cover: " + cover;
    }
}

class BookTest {
    public static void main(String[] args) {
        makeListOfBooks();
    }
}
