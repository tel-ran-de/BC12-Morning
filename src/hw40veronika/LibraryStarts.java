package hw40veronika;

public class LibraryStarts {
    public static void main(String[] args) {
        Book abc = new Book(111, false, 34, 23.4);
        abc.changeTheCost(abc.bookCost);
        System.out.println("-------");

        Book warAndPeace = new Book(222, true, 1945, 9);
        System.out.println("-------");

        Book desertStops = new Book("Остановки в пустыне", "Иосиф Бродский", "poetry", 2010, 333);
        System.out.println("-------");

        Book tastyHealthyFood = new Book(444, true, 2019, 3);
        desertStops.changeTheCost(15.5);

        System.out.println("-------");
        Book nonviolentCommunication = new Book(555, false, 2001, 9);
        nonviolentCommunication.checkThePages(nonviolentCommunication.bookPages);
        System.out.println("-------");

        Book[] myStrangeLibrary = {abc, warAndPeace, desertStops, tastyHealthyFood, nonviolentCommunication};
    }
}
