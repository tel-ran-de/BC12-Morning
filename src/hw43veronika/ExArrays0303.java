package hw43veronika;

import java.util.Arrays;

public class ExArrays0303 {
    //Arrays3, Exercise 03
    //Учитывая n> = 0, создайте массив с шаблоном {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
    //(пробелы добавлены, чтобы показать группировку). Обратите внимание, что длина массива будет 1 + 2 + 3 ... + n, которая, как известно, суммируется ровно с n * (n + 1) / 2.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3))); //{1,   1, 2,   1, 2, 3,   ... 1, 2, 3 .. n}
        System.out.println(Arrays.toString(seriesUp(4))); //{1,   1, 2,   1, 2, 3,  1, 2, 3, 4 ... 1, 2, 3 .. n}
        System.out.println(Arrays.toString(seriesUp(2)));
    }

    private static int[] seriesUp(int n) {
        int length = n * (n + 1) / 2;
        int[] array = new int[length];
        int index = 0;  //переменная для обозначения порядкового номера ячейки массива
        for (int j = 1; j <= n; j++) {  //начинаем с единицы и до n, тк внешний цикл - это количество проходов
            for (int i = 1; i <= j; i++) { //заполняем массив
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}
