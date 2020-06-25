package hw.Hw45_BooksArray;

import java.util.ArrayList;

/**
 * FirstNewVersion 24.06.2020
 */
public class BooksList {
    public static void makeListOfBooks() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        Book azbuka = new Book("Азбука", 30, 6.5, Cover.HARD);
        Book podruga = new Book("Моя гениальная подруга", 215, 12.4, Cover.SOFT);
        Book stories = new Book("Сборник рассказов", 124, 8.20, Cover.POCKET);
        Book neznaika = new Book("Незнайка на луне", 25, 8.80, Cover.HARD);
        Book tails = new Book("Сказки народов мира", 86, 14.1, Cover.SOFT);
        Book rules = new Book("Правила виноделов", 290, 6.5, Cover.EBOOK);
        Book moem = new Book("Узорный покров", 120, 4.2, Cover.EBOOK);
        Book chinese = new Book("Китаец", 367, 15.0, Cover.HARD);

        listOfBooks.add(azbuka);
        listOfBooks.add(podruga);
        listOfBooks.add(stories);
        listOfBooks.add(1, neznaika);
        listOfBooks.add(2, tails);
        listOfBooks.add(rules);
        listOfBooks.add(moem);
        listOfBooks.add(chinese);

        System.out.println(listOfBooks); // печатает адрес

    }
}
