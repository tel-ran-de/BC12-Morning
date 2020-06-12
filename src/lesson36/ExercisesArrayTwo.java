package lesson36;

import java.util.Arrays;

/**
 * BC12-Morning
 * 12 12 : 17
 */
public class ExercisesArrayTwo {
    public static void main(String[] args) {
        /*notAlone([1, 2, 3], 2) → [1, 3, 3]
        notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
        notAlone([3, 4], 3) → [3, 4]*/
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 2, 5, 2};
        int[] a3 = {3, 4};
        int[] a4 = {1, 2, 3, 2, 5, 2, 1}; //[1, 3, 3, 5, 5, 5, 1]

        System.out.println(Arrays.toString(notAlone(a1, 2)));  // [1, 3, 3]
        System.out.println(Arrays.toString(notAlone(a2, 2)));  // [1, 3, 3, 5, 5, 2]
        System.out.println(Arrays.toString(notAlone(a3, 3)));  // [3, 4]
        System.out.println(Arrays.toString(notAlone(a4, 2)));  // [3, 4]
    }

    private static int[] notAlone(int[] array, int digit) {
        if (array.length < 3) {
            return array;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == digit && array[i + 1] != digit && array[i - 1] != digit) {
                int bigNumber = array[i - 1];
                if (array[i + 1] > array[i - 1]) {
                    bigNumber = array[i + 1];
                }
                array[i] = bigNumber;
            }
        }
        return array;
    }
}
