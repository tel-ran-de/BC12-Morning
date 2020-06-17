package HomeWork40Book;

import java.util.Arrays;

/**
 * BC12-Morning
 * 17/06/2020  21:32
 */
public class Book {
    String nameBook;
    String authorBook;
    int yearOfIssue;
    int isbn;
    double prise;
    int pages;
    String cover;

    public Book() {

    }

    public Book(String hardcover) {
        cover = hardcover;
    }

    public Book(int pages) {
        System.out.println("В книге " + pages + " стр");

    }

    public Book(String authorBook, int year) {

    }

    void booksForSchool() {
        System.out.println("У нас в наличии книга для вашего ребёнка  " + nameBook + " <" + authorBook + ">" + yearOfIssue + " года выпуска");

    }

    void historicalBooks() {
        System.out.println("Мы предлагаем вам книгу " + "'" + nameBook + "' " + authorBook);

    }

    void detectiveBooks() {
        System.out.println("Для вас у нас есть  " + authorBook + " <" + nameBook + "> "
                + yearOfIssue + "года выпуска" + " цена " + prise);

    }

    void myPrint() {
        System.out.println("У нас вы можете приобрести " + nameBook + authorBook);
    }
}


class BooksSale {

    public static void main(String[] args) {
        Book mybookOne = new Book();
        mybookOne.nameBook = "Alphabet";
        mybookOne.authorBook = "A.Jukova";
        mybookOne.pages = 30;
        mybookOne.yearOfIssue = 2019;
        mybookOne.prise = 20.25;
        mybookOne.isbn = 13 - 65 - 89;


        mybookOne.booksForSchool();
        System.out.println("------------- ");

        Book myBookTwo = new Book();
        myBookTwo.nameBook = "Peter the First";
        myBookTwo.authorBook = "Alexey Tolstoy";
        myBookTwo.yearOfIssue = 1930;
        myBookTwo.prise = 200.00;
        myBookTwo.isbn = 13 - 65 - 89 - 25;

        myBookTwo.historicalBooks();
        System.out.println("--------------");

        Book myBookThree = new Book();
        myBookThree.nameBook = "The tragedy in three acts";
        myBookThree.authorBook = "Agatha Christie";
        myBookThree.yearOfIssue = 2020;
        myBookThree.prise = 20.50;
        myBookThree.isbn = 13 - 65 - 89 - 25;

        myBookThree.detectiveBooks();
        System.out.println("---------");


        Book[] booksCollection = {mybookOne, myBookTwo, myBookThree};
        mybookOne.myPrint();
        myBookTwo.myPrint();
        myBookThree.myPrint();

        System.out.println(Arrays.toString(booksCollection));

    }

}
