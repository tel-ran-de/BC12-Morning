package Obj_HomeWork41;

import java.util.Arrays;

public class Books {
    private String name;
    private int isbn;
    private int pages;
    private double price;

    public Books(String name, int isbn, int pages, double price) {
        this.name = name;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void myPrint() {
        System.out.println("Ваша книга - " + getName() + " - код  <" + getIsbn() + " > " + getPages() + " стр. " + " цена " + getPrice() + " евро " + " готова к отправке !");
    }
}

class BookTest {
    public static void main(String[] args) {
        Books book1 = new Books("Безмолвный пациент", 1212112, 50, 20.00);
        book1.myPrint();
       /* book1.setPrice(20.25);
        book1.setPrice(15.25);
        book1.setPages(200);
        book1.setIsbn(12321);*/
        Books book2 = new Books("Мастер и Маргарита", 21365689, 200, 50.00);
        book2.myPrint();
        Books book3 = new Books("Над пропастью во ржи", 12121, 100, 30.00);
        book3.myPrint();
        Books book4 = new Books("Идиот", 12121, 35, 15);
        book4.myPrint();
        Books book5 = new Books("Горе от ума", 12121, 50, 20.00);
        book5.myPrint();
        Books book6 = new Books("Маленький принц", 12121, 50, 20.00);
        book6.myPrint();
        Books book7 = new Books("Коллекционер", 12121, 50, 20.00);
        book7.myPrint();
        Books book8 = new Books("Дон Кихот", 12121, 50, 20.00);
        book8.myPrint();
        Books book9 = new Books("Милый друг", 12121, 50, 20.00);
        book9.myPrint();
        Books book10 = new Books("Герой нашего времени", 12121, 50, 20.00);
        book10.myPrint();
        System.out.println("------------------------------------------");

        Books[] booksCollection = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        System.out.println(Arrays.toString(booksCollection));
    }
}
