package homework45;

import java.util.ArrayList;

import static homework45.BookStore.listOfBooks;
import static homework45.Cover.SOFTCOVER;

/**
 * BC12-Morning
 * 6/24/20 19: 02
 */
public class BookStore {
    public static void listOfBooks() {
        Book book1 = new Book("ABC", 111, Cover.HARDCOVER);
        Book book2 = new Book("Vegan food", 876, Cover.HARDCOVER);
        Book book3 = new Book("Gone with the Wind", 111, Cover.EBOOK);
        Book book4 = new Book("Scarlett", 999, Cover.PAPERBACK);
        Book book5 = new Book("The Testaments", 666, SOFTCOVER);
        Book book6 = new Book("Lights All Night Long: A Novel", 123, Cover.EBOOK);
        ArrayList<Book> listOfBooks = new ArrayList<Book>();

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        listOfBooks.add(book6);
        System.out.println(listOfBooks);
    }
}

class BookStoreTest {
    public static void main(String[] args) {
        listOfBooks();
    }
}


