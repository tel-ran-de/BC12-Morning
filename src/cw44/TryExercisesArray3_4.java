package cw44;

import java.util.Arrays;

/**
 * BC12-Morning
 * 23 10 : 52
 */
public class TryExercisesArray3_4 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 1, 4};   // [1, 3, 4, 1].
        int[] a2 = {1, 3, 1, 4, 4, 3, 1};   // [1, 3, 4, 1, 1, 3, 4]
        int[] a3 = {3, 2, 2, 4};   // [3, 4, 2, 2]
        System.out.println(Arrays.toString(fix34(a1))); // [1, 3, 4, 1].
        System.out.println(Arrays.toString(fix34(a2))); // [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(a3))); // [3, 4, 2, 2]
    }

    public static int[] fix34(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == 4 && array[j - 1] != 3) {
                        int temp = array[i + 1];
                        array[i + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
