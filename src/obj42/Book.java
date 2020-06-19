package obj42;

/**
 * BC12-Morning
 * 19 09 : 59
 */
public class Book {
    private String name;
    private String author;
    private long isbn;
    private int pages;
    private int editionYear;
    private double price;
    private String cover;
    private String pictures;
    private String genre;

    public Book() {
    }

    public Book(String name, String author, long isbn, int pages, int editionYear, double price, String cover, String pictures, String genre) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.editionYear = editionYear;
        this.price = price;
        this.cover = cover;
        this.pictures = pictures;
        this.genre = genre;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, String author, double price, String cover) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
