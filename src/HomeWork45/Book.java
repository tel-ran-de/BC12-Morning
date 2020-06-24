package HomeWork45;

/**
 * TelRanJavaBasicModulOne
 * 24/06/2020  21:53
 */
public class Book {
    public String name;
    public Cover cover;
    public int isbn;
    public int pages;
    public double price;


    public Book() {
    }

    public Book(String name, Cover cover, int isbn, int pages, double price) {
        this.name = name;
        this.cover = cover;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cover=" + cover +
                ", isbn=" + isbn +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
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

}

class BookTest{
    public static void main(String[] args) {


    }
}


