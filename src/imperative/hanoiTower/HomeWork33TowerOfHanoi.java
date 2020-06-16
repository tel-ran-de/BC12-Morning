package imperative.hanoiTower;

public class HomeWork33TowerOfHanoi {

    static int count = 1;

    public static void main(String[] args) {
        hanoiTower(5, "A", "B", "C");
    }

    public static void hanoiTower(int n, String start, String temp, String end) {

        if (n == 1) {
            System.out.println(count + " Переместить диск с " + start + " на " + end);
            count++;
        } else {
            hanoiTower(n - 1, start, end, temp);
            System.out.println(count + " Переместить диск с " + start + " на " + end);
            count++;
            hanoiTower(n - 1, temp, start, end);
        }
    }
}
