package HomeWork45;

import java.util.ArrayList;

/**
 * TelRanJavaBasicModulOne
 * 24/06/2020  22:03
 */
public class BookShop {
    public static ArrayList<Book> listOfBook() {
        ArrayList<Book> listOfBook = new ArrayList<>();
        Book book1 = new Book("Безмолвный пациент ", Cover.HARD, 123, 100, 20.25);
        Book book2 = new Book("Мастер и Маргарита ", Cover.SOFT, 2563, 60, 10.50);
        Book book3 = new Book("Над пропастью во ржи ", Cover.EBOOK, 1354, 86, 28.30);
        Book book4 = new Book("Идиот ", Cover.POCKET, 658, 268, 125.00);
        Book book5 = new Book("Горе от ума ", Cover.HARD, 6723, 50, 15.75);
        Book book6 = new Book("Маленький принц ", Cover.HARD, 4567, 98, 75.05);
        Book book7 = new Book("Дон Кихот", Cover.SOFT, 6589, 165, 19.65);
        Book book8 = new Book("Милый друг ", Cover.SOFT, 6891, 142, 38.90);
        Book book9 = new Book("Герой нашего времени ", Cover.EBOOK, 3456, 60, 57.60);
        Book book10 = new Book("Коллекционер ", Cover.POCKET, 6872, 169, 64.65);

        listOfBook.add(book1);
        listOfBook.add(book2);
        listOfBook.add(book3);
        listOfBook.add(book4);
        listOfBook.add(book5);
        listOfBook.add(book6);
        listOfBook.add(book7);
        listOfBook.add(book8);
        listOfBook.add(book9);
        listOfBook.add(book10);

        return listOfBook;


    }

}

class BookShopTest {
    public static void main(String[] args) {
        ArrayList<Book> list = BookShop.listOfBook();
        System.out.println(list);



    }

}