package hw40veronika;

import com.sun.org.apache.xpath.internal.XPathAPI;

public class Book {
    double bookIsbn;
    String bookTitle;
    String bookAutor;
    int publicationYear;
    int bookPages;
    boolean hardCover;
    String bookGenre;
    int bookRating;
    double bookCost;

    public Book() {
    }

    public Book(double isbn, boolean cover, int pages, double cost) {
        this.bookIsbn = isbn;
        this.hardCover = cover;
        this.bookCost = cost;
        this.bookPages = pages;
        System.out.println("Экземпляр " + isbn + ", твёрдый переплёт: " + cover + ", " + pages + " страниц, цена: " + cost);
        checkThePages(pages);
    }

    public Book(double isbn, boolean cover, int year, int rating) {
        this.bookIsbn = isbn;
        this.hardCover = cover;
        this.publicationYear = year;
        this.bookRating = rating;
        System.out.println("Экземпляр " + isbn + ", твёрдый переплёт: " + cover + ", " + year + " года выпуска, " + " рейтинг: " + rating);
        checkTheState();
    }

    public Book(String title, String autor, String genre, int year, double isbn) {
        this.bookIsbn = isbn;
        this.bookAutor = autor;
        this.bookTitle = title;
        this.publicationYear = year;
        this.bookGenre = genre;
        System.out.println("Книга " + title + ", автор: " + autor + ", экземпляр " + isbn + " , жанр: " + genre);
    }

    void checkTheState() {
        //метод помогает проверить, нуждается ли в починке или замене книга
        if (publicationYear < 1970 & !hardCover) {
            System.out.println("Экземпляр книги " + bookIsbn + " необходимо заменить новым");
        } else if (publicationYear < 2000) {
            System.out.println("Книга " + bookIsbn + " нуждается в починке");
        }
        else {
            System.out.println("С экземпляром книги " + bookIsbn + " всё ок");
        }
    }

    void checkThePages(int pages) {
        //метод помогает проверить состояние страниц - нет ли порванных страниц или заметок
        this.bookPages = pages;
        for (int i = 1; i < pages; i++) {
            //проходим в цикле все страницы книги, начиная с 1 и печатаем ее состояние
            System.out.println("Книга " + bookIsbn + ": страница " + i + " не повреждена");
        }
    }

    void changeTheCost(double cost) {
        if (hardCover) {
            if (bookRating >= 8) {
                cost = cost * 1.3;
            } else {
                cost = cost * 1.2;
            }
        }
        else {
            cost = cost * 1.1;
        }
            System.out.println("Цена книги " + bookIsbn + " может быть заменена на " + cost);
    }
}
