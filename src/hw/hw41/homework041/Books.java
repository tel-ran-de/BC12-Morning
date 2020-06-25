package hw.hw41.homework041;

/**
 * BC12-Morning
 * 6/18/20 12: 31
 */
public class Books {
    private int ID;
    private int pages;
    private double price;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Books(int ID, int pages, double price) {
        this.ID = ID;
        this.pages = pages;
        this.price = price;
    }
}

class BooksTest {
    public static void main(String[] args) {
        Books book0 = new Books(12, 500, 18.45);
        Books book1 = new Books(45, 878, 46.45);
        Books book2 = new Books(5, 18, 5.45);
        Books book3 = new Books(89, 166, 6.38);
        Books book4 = new Books(90, 676, 11.85);
        Books book5 = new Books(1, 890, 10.45);
        Books book6 = new Books(17, 456, 16.00);
        Books book7 = new Books(98, 81, 55.00);
        Books book8 = new Books(11, 67, 44.99);
        Books book9 = new Books(18, 676, 112.00);

        Books[] booksInShop = {book0, book1, book2, book3, book4, book5, book6, book7, book8, book9};
        myArrayPrint((Books[]) bubble(booksInShop));
    }

    public static Object[] bubble(Books[] myArray) {
        int countChanging = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i].getPrice() > myArray[i + 1].getPrice()) {
                Books temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
                countChanging++;
            }
            // второе
        }
        //System.out.println("Count: " + countChanging);
        if (countChanging > 0) {
            bubble(myArray);
        }
        return myArray;
    }

    public static void myArrayPrint(Books[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length - 1; i++) {
            double value = arrayToPrint[i].getPrice();
            System.out.println(value);
        }
    }

}