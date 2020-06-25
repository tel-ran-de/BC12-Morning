package hw45veronika;

public class Book {
    int bookIsbn;
    String bookTitle;
    String bookAuthor;
    int publicationYear;
    int bookPages;
    Cover cover;
    String bookGenre;
    int bookRating;
    double bookPrice;

    public Book() {
    }

    public Book(int isbn, String name, Cover cover, int year, int rating) {
        this.bookIsbn = isbn;
        this.cover = cover;
        this.publicationYear = year;
        this.bookRating = rating;
        this.bookTitle = name;
        System.out.println("Экземпляр " + isbn + ", название: " + name + "переплёт: " + cover + ", " + year + " года выпуска, " + " рейтинг: " + rating);
        checkTheState();
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
        if (publicationYear < 1970 & cover != Cover.hard) {
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
        if (cover == Cover.electronic) {
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
