package hw43.HomeWork43;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 22/06/2020  12:39
 */
public class HomeWork43Arrays {
    public static void main(String[] args) {
        //n * (n + 1) / 2.
        System.out.println(Arrays.toString(seriesUp(3)));//[1,....1, 2,....1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4)));//[1,...1, 2,...1, 2, 3,...1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2)));//[1,...1, 2]

        int[] a1 = {0, 5, 0, 3};
        int[] a2 = {0, 4, 0, 3};
        int[] a3 = {0, 1, 0};
        int[] a4 = {1, 0, 4, 0, 5};
        System.out.println(Arrays.toString(zeroMax(a1))); // 5,5,3,3
        System.out.println(Arrays.toString(zeroMax(a2))); // 3,4,3,3
        System.out.println(Arrays.toString(zeroMax(a3))); // 1,1,0
        System.out.println(Arrays.toString(zeroMax(a4))); // 1,5,4,5,5

    }

    //Учитывая n> = 0, создайте массив с шаблоном {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
    // (пробелы добавлены, чтобы показать группировку). Обратите внимание,
    // что длина массива будет 1 + 2 + 3 ... + n,
    // которая, как известно, суммируется ровно с n * (n + 1) / 2.

    //Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
    // (spaces added to show the grouping).
    // Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
    private static int[] seriesUp(int n) {
        int[] array = new int[n * (n + 1) / 2];
        int count = 0;
        for (int i = 1; i <= n; i++) { // для подсчёта групп*где мы находимся
            for (int j = 1; j < (i + 1); j++) { // начинаем с 1 так как подгруппы начинаются с 1
                array[count] = j;
                count++;
            }

        }

        return array;
    }

    //Arrays02-23_Return a version of the given array where each zero value in the array is replaced
    // by the largest odd value to the right of the zero in the array.
    // If there is no odd value to the right of the zero, leave the zero as a zero.
    //Вернуть версию данного массива, где каждое нулевое значение в массиве заменяется наибольшим
    // нечетным значением справа от нуля в массиве.
    // Если справа от нуля нет нечетного значения, оставьте ноль как ноль.
    public static int[] zeroMax(int[] array) {
        // Stores previous largest odd - default to 0 to avoid replacement
        // Сохраняет предыдущее наибольшее нечетное значение - по умолчанию 0, чтобы избежать замены
        int replace = 0;

        for (int i = array.length - 1; i >= 0; i--) { // start from end - начинаем с конца
            final int next = array[i];
            if (next == 0) { // If we should replace-если должны заменить
                array[i] = replace;
            } else if (next % 2 == 1 && next > replace) {
                // If we have an odd number that is larger than the replacement
                // Если у нас есть нечетное число, которое больше, чем замена
                replace = next;
            }
        }
        return array;

    }
}
