package hw41_veronika.hw40veronika;

public class Book {
    int bookIsbn;
    String bookTitle;
    String bookAuthor;
    int publicationYear;
    int bookPages;
    boolean hardCover;
    String bookGenre;
    int bookRating;
    double bookPrice;

    public Book() {
    }

    public Book(int isbn, String name, int pages, double price) {
        setBookIsbn(isbn);
        setBookTitle(name);
        setBookPrice(price);
        setBookPages(pages);
        System.out.println("Экземпляр " + isbn + ", название: " + name + ", " + pages + " страниц, цена: " + price);
    }

    public Book(int isbn, boolean cover, int year, int rating) {
        this.bookIsbn = isbn;
        this.hardCover = cover;
        this.publicationYear = year;
        this.bookRating = rating;
        System.out.println("Экземпляр " + isbn + ", твёрдый переплёт: " + cover + ", " + year + " года выпуска, " + " рейтинг: " + rating);
        checkTheState();
    }

    public Book(String title, String author, String genre, int year, int isbn) {
        this.bookIsbn = isbn;
        this.bookAuthor = author;
        this.bookTitle = title;
        this.publicationYear = year;
        this.bookGenre = genre;
        System.out.println("Книга " + title + ", автор: " + author + ", экземпляр " + isbn + " , жанр: " + genre);
    }

    private void setBookIsbn(int isbn){
        this.bookIsbn = isbn;
    }

    public int getBookIsbn(){
        return bookIsbn;
    }

    private void setBookTitle(String title){
        this.bookTitle = title;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    private void setBookAuthor(String author){
        this.bookAuthor = author;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

    private void setPublicationYear(int year){
        this.publicationYear = year;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setBookPages(int pages){
        this.bookPages = pages;
    }

    public int getBookPages(){
        return bookPages;
    }

    private void setHardCover(boolean cover){
        this.hardCover = cover;
    }

    public boolean getHardCover(){
        return hardCover;
    }

    private void setBookGenre(String genre){
        this.bookGenre = genre;
    }

    public String getBookGenre(){
        return bookGenre;
    }

    public int getBookRating() {
        return bookRating;
    }

    public void setBookRating(int rating) {
        this.bookRating = rating;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double price) {
        this.bookPrice = price;
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
