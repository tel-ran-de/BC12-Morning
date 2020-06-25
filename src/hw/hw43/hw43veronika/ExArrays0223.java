package hw.hw43.hw43veronika;

import java.util.Arrays;

public class ExArrays0223 {
    public static void main(String[] args) {
        //exercise-Arrays-02-23
        //Вернуть версию данного массива, где каждое нулевое значение в массиве заменяется наибольшим нечетным значением
        //права от нуля в массиве. Если справа от нуля нет нечетного значения, оставьте ноль как ноль.

        int[] a = {0, 5, 0, 3}; //[5, 5, 3, 3]
        int[] b = {0, 4, 0, 3}; //[3, 4, 3, 3]
        int[] c = {0, 1, 0}; //[1, 1, 0]

        System.out.println(Arrays.toString(zeroMax(a)));
        System.out.println(Arrays.toString(zeroMax(b)));
        System.out.println(Arrays.toString(zeroMax(c)));


    }

    private static int[] zeroMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) { //начинаем проходить цикл с точки справа от найденного нуля
                    if (array[j] % 2 != 0 && array[j] > array[i]) {
                        max = array[j];
                        array[i] = max;
                    }
                    if (array[j] % 2 == 0 && array[j] > array[i]) {
                        max = 0;
                        array[i] = max;
                    }
                }
            }
        }
        return array;
    }
}
