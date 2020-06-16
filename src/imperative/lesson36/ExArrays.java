package imperative.lesson36;

import java.util.Arrays;

/**
 * BC12-Morning
 * 12.06.2020
 */
public class ExArrays {
    public static void main(String[] args) {
        int[] a1 = {25, 14, 2, 18, 36};
        int[] a2 = {1, 2, 3, 4, 5};
        mergeTest(a1,a2);
        // System.out.println(Arrays.toString(anotherMerge(a1, a2)));
    }

/*    private static int[] anotherMerge(int[] a1, int[] a2) {
        int[] result;
       // result = ArrayUtils.addAll(intArray, intArray2);

        return result;
    }*/

    private static void mergeTest(int[] a1, int[] a2) {
        //слияние двух массивов

        int[] c = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            c[i] = a1[i];
        }
        System.out.println("a1 = " + a1.length);
        System.out.println("c = " + c.length);

        for (int i = 0; i < a2.length; i++) {
            c[i + a1.length] = a2[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
