package hw.Homework039;

/**
 * BC12M_copy_1606
 * 16.06.2020
 */
public class SwanMasha {
    String color;
    boolean chicken;
    int age;
    int weight;

    //шипит - hiss, кусается - bite, щиплет траву - graze, плавает - swim

    void canHiss() {
        if (chicken) {
            System.out.println("Осторожно! Это мое озеро! Держитесь от меня подальше");
        } else canGraze();
    }

    void canSwim() {
        if (age > 8) {
            System.out.println("Мне пофигу, что вы там делаете");
        } else canBite();
    }

    void canBite() {
        System.out.println("Уходите отсюда! Я сегодня злой");
    }

    void canGraze() {
        System.out.println("Ладно уж, гуляйте, можно даже пару фоток сделать, я сегодня добрый");
    }
}

