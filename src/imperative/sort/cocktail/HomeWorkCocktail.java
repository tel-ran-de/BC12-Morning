package imperative.sort.cocktail;

import java.util.Arrays;

public class HomeWorkCocktail {
    public static void main(String[] args) {
        int[] unSortArray = {5, 8, 4, 9, 1, -1, 6, 200, 90, 1};
        System.out.println(Arrays.toString(makeBubbleSortImprovementTwo(unSortArray)));
    }

    public static int[] makeBubbleSortImprovementTwo(int[] array) {
        int start = 0;
        int end = array.length - 1;
        boolean swapped = false;
        ;
        do {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    //test if two elements are in the wrong order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
                System.out.println("end: " + end);
            }
            end--;

            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            start++;
            System.out.println("---------------------------\n"); // print for for debugging
        } while (swapped == true);
        return array;
    }
}
