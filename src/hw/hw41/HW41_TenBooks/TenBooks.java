package hw.hw41.HW41_TenBooks;

/**
 * FirstNewVersion
 * 18.06.2020
 */
public class TenBooks {
    private String name;
    private int pages;
    private double price;
    private String idNumber;

    TenBooks() {
    }

    public TenBooks(String name, int pages, double price, String idNumber) {//для инициализации книг
        this.name = name;
        this.pages = pages;
        this.price = price;
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(String idNumber) {
        if (idNumber.length() == 4) {
            this.idNumber = idNumber;
        } else System.out.println("Wrong number");
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setPages(int pages) {
        System.out.println("Количество страниц не изменяется");
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class booksList {
    public static void main(String[] args) {
        TenBooks book1 = new TenBooks("Азбука", 30, 6.5, "1120");
        TenBooks book2 = new TenBooks("Моя гениальная подруга", 215, 10.8, "2574");
        TenBooks book3 = new TenBooks("Сборник рассказов", 45, 8.45, "6817");
        TenBooks book4 = new TenBooks("Незнайка на Луне", 10, 2.9, "3221");
        TenBooks book5 = new TenBooks("Сказки народов мира", 95, 17.4, "3381");
        TenBooks book6 = new TenBooks("Сонечка", 34, 8.3, "5297");
        TenBooks book7 = new TenBooks("Узорный покров", 55, 12.4, "3611");
        TenBooks book8 = new TenBooks("Правила виноделов", 248, 18.7, "1559");
        TenBooks book9 = new TenBooks("Китаец", 389, 18.80, "6248");
        TenBooks book10 = new TenBooks("Грокаем алгоритмы", 290, 20.1, "6281");

        TenBooks[] allTenBooks = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        for (TenBooks element : allTenBooks) {
            System.out.println(element.getIdNumber() + " " + element.getName() + ", price, EUR: " + element.getPrice());
        }

        System.out.println("ID of the book1 is " + book1.getIdNumber());
        System.out.println(book3.getName() + " has " + book3.getPages() + " pages");
    }
}

