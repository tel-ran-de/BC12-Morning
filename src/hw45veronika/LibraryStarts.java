package hw45veronika;

import java.util.ArrayList;

public class LibraryStarts {
    public static void main(String[] args) {
        Book abc = new Book(111, "Азбука ", Cover.pocket, 1999, 23);
        System.out.println("-------");

        Book warAndPeace = new Book(222, "Война и мир ", Cover.hard, 1945, 40);
        System.out.println("-------");

        Book desertStops = new Book(555, "Остановки в пустыне ", Cover.soft, 2010, 90);
        System.out.println("-------");

        Book tastyHealthyFood = new Book(444, "Книга о вкусной и здоровой пище ", Cover.electronic, 2020, 50);
        System.out.println("-------");

        Book nonviolentCommunication = new Book(555, "Ненасильственное общение ", Cover.soft, 2018, 80);
        System.out.println("-------");

        Book harrypotter1 = new Book(655, "Гарри Поттер и философский камень ", Cover.hard, 1996, 90);
        System.out.println("-------");

        Book harrypotter2 = new Book(755, "Гарри Поттер и тайная комната ", Cover.soft, 2000, 60);
        System.out.println("-------");

        Book harrypotter3 = new Book(855, "Гарри Поттер и узник Азкабана ", Cover.electronic, 2001, 80);
        System.out.println("-------");

        Book harrypotter4 = new Book(955, "Гарри Поттер и Кубок огня ", Cover.pocket, 2005, 58);
        System.out.println("-------");

        Book harrypotter5 = new Book(585, "Гарри Поттер и Орден Феникса ", Cover.electronic, 2006, 100);
        System.out.println("-------");

        Book[] myStrangeLibrary = {abc, warAndPeace, desertStops, tastyHealthyFood, nonviolentCommunication, harrypotter1, harrypotter2, harrypotter3, harrypotter4, harrypotter5};


        ArrayList<Book> myFirstArrayList = new ArrayList<>();
        myFirstArrayList.add(harrypotter1);
        myFirstArrayList.add(harrypotter2);
        myFirstArrayList.add(harrypotter3);
        myFirstArrayList.add(harrypotter4);
        myFirstArrayList.set(3, harrypotter5);

        System.out.println(myFirstArrayList.contains(harrypotter1));
        System.out.println(myFirstArrayList.size());
    }
}
