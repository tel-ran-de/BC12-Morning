package hw43;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 22.06.2020
 */
public class Ls43Arrays3_03 {
    public static void main(String[] args) {
        //n * (n + 1) / 2
        System.out.println(Arrays.toString(seriesUp(3))); //[1,   1, 2,   1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4))); //[1,   1, 2,   1, 2, 3,   1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2))); //[1,   1, 2]


    }

    //Arrays3-03
    // Учитывая n> = 0, создайте массив с шаблоном {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
    // (пробелы добавлены, чтобы показать группировку).
    // Обратите внимание, что длина массива будет 1 + 2 + 3 ... + n, которая, как известно, суммируется с n * (n + 1) / 2.

    private static int[] seriesUp(int n) {
        int length = n * (n + 1) / 2;
        int[] array = new int[length];



        return array;
    }

}
