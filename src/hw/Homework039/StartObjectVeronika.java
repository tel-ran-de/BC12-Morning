package hw.Homework039;

public class StartObjectVeronika {
    public static void main(String[] args) {
        //создаем экземпляр класса с помощью пустого конструктора
        SwanVeronika nikolay = new SwanVeronika();
        nikolay.age = 2;
        //присваиваем значение его классовому атрибуту
        System.out.println("The swan " + nikolay.age + " ages, ID: " + nikolay.qrCode + " heathy status is " + nikolay.healthStatus);
        //проверяем, что значение присвоилось + проверяем дефолтные значения других атрибутов

        System.out.println("------------------");

        SwanVeronika chernysh = new SwanVeronika(4, 1020);
        //создаем экземпляр класса с использованием конструктора с методом fight. ожидаем 3 строчки, если условия в цикле if true и 4 строчки, если false

        System.out.println("------------------");

        SwanVeronika boris = new SwanVeronika(1, 1111);
        //создаем еще один экземпляр класса с использованием конструктора с методом fight. ожидаем 3 строчки, если условия в цикле if true и 4 строчки, если false

        System.out.println("------------------");

        SwanVeronika krasotka = new SwanVeronika(3, 3454, "white", "female");
        //создаем экзепляр класса с использованием другого конструктора с методом eat, ожидаем 2 строчки - метод и вывод значений атрибутов.
    }
}
