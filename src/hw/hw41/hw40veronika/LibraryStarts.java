package hw.hw41.hw40veronika;

public class LibraryStarts {
    public static void main(String[] args) {
        Book abc = new Book(111, "Азбука", 34, 23.4);
        System.out.println("-------");

        Book warAndPeace = new Book(222, "Война и мир", 945, 40);
        System.out.println("-------");

        Book desertStops = new Book(555, "Остановки в пустыне", 210, 33);
        System.out.println("-------");

        Book tastyHealthyFood = new Book(444, "Книга о вкусной и здоровой пище", 190, 13);
        System.out.println("-------");

        Book nonviolentCommunication = new Book(555, "Ненасильственное общение", 301, 19);
        System.out.println("-------");

        Book harrypotter1 = new Book(655, "Гарри Поттер и философский камень", 101, 10);
        System.out.println("-------");

        Book harrypotter2 = new Book(755, "Гарри Поттер и тайная комната", 150, 12);
        System.out.println("-------");

        Book harrypotter3 = new Book(855, "Гарри Поттер и узник Азкабана", 201, 13);
        System.out.println("-------");

        Book harrypotter4 = new Book(955, "Гарри Поттер и Кубок огня", 250, 15);
        System.out.println("-------");

        Book harrypotter5 = new Book(585, "Гарри Поттер и Орден Феникса", 301, 18);
        System.out.println("-------");

        Book[] myStrangeLibrary = {abc, warAndPeace, desertStops, tastyHealthyFood, nonviolentCommunication, harrypotter1, harrypotter2, harrypotter3, harrypotter4, harrypotter5};
    }
}
