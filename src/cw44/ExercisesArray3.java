package cw44;

import java.util.Arrays;

/**
 * BC12-Morning
 * 23 10 : 12
 */
public class ExercisesArray3 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 1, 4};   // [1, 3, 4, 1].
        int[] a2 = {1, 3, 1, 4, 4, 3, 1};   // [1, 3, 4, 1, 1, 3, 4]
        int[] a3 = {3, 2, 2, 4};   // [3, 4, 2, 2]
        System.out.println(Arrays.toString(fix34(a1))); // [1, 3, 4, 1].
        System.out.println(Arrays.toString(fix34(a2))); // [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(a3))); // [3, 4, 2, 2]
    }

    private static int[] fix34(int[] array) {
        /*
        1. Найти индекс тройки
        2. Узнать, что идёт за тройкой
        3. Найти индексы четвёрок
        4. Поменять следующие за тройками цифры на имеющиеся четвёрки
         */
        int count;
        do {
            count = 0;
            int indexAfterKey = array[0];
            int indexKeySingleFor = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 3 && array[i + 1] != 4) {
                    indexAfterKey = i + 1;
                }
                if (array[i] == 4 && array[i - 1] != 3) {
                    indexKeySingleFor = i;
                }
            }
            int temp = array[indexAfterKey];
            array[indexAfterKey] = array[indexKeySingleFor];
            array[indexKeySingleFor] = temp;
            count++;
        } while (count == 0);
        return array;
    }

    /*
    Return an array that contains exactly the same numbers as the given array,
     but rearranged so that every 3 is immediately followed by a 4.
      Do not move the 3's, but every other number may move.
       The array contains the same number of 3's and 4's,
        every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
    Возвращаем массив, содержащий точно такие же числа,
     как и в данном массиве, но перестроенный так,
      что за каждыми 3 сразу следует 4. Не перемещайте 3,
       но каждое другое число может перемещаться.
        Массив содержит те же самые числа 3 и 4, каждые 3 имеют число после,
         которое не является 3, а 3 появляется в массиве перед любыми 4.
fix34([1, 3, 1, 4]) → [1, 3, 4, 1].
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     */
}
