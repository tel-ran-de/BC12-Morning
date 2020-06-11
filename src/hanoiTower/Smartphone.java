package hanoiTower;

public class Smartphone {
    static int sound = 0;

    public static void main(String[] args) {
        movie();
        music();
    }
    public static void readBook() {
        int britness = 75;
    }
    public static void setSoundMinus() {
        sound--;
    }

    public static void setSoundPlus() {
        sound++;
    }

    public static void movie() {
        setSoundPlus();
    }

    public static void call() {
        setSoundMinus();
    }

    public static void music() {
        setSoundMinus();
        setSoundMinus();
        System.out.println(sound);
    }
}
