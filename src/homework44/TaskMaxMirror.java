package homework44;
import java.util.Arrays;
/**
 * BC12-Morning
 * 6/23/20 19: 37
 */
public class TaskMaxMirror {
    public static void main(String[] args) {
        // Exercises-Arrays-03-06
        int[] k1 = {1, 2, 3, 8, 9, 3, 2, 1}; // 3
        int[] k2 = {1, 2, 1, 4}; //3
        int[] k3 = {7, 1, 2, 9, 7, 2, 1}; //2
        System.out.println(maxMirror(k1));
        System.out.println(maxMirror(k2));
        System.out.println(maxMirror(k3));

//        System.out.println("K1: сам массив"); // для debugging
//        System.out.println(Arrays.toString(k1));
//        System.out.println("перевернуый массив");
//        System.out.println(Arrays.toString(reverse(k1)));
    }

    // Exercises-Arrays-03-06
    //We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
    // the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
    // is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
    /*
     Решение через 2 метода:
     1) метод reverse ,чтобы перевернуть массив
     2) делаем 2 цикла в методе maxMirror для массива из условия и перевернутого
     3) пока array[i] == array2[j] и значения не выходят за пределы массива, то i++; j++; в это же время увеличивается
     число совпадений: size++
     4) находим максимальное число совпадений с помощью Math.max
     */
    public static int maxMirror(int[] array) {
        int max = 0;
        int[] array2 = reverse(array);

        for (int start = 0; start < array.length; start++) {
            for (int begin = 0; begin < array2.length; begin++) {

                int size = 0;
                int i = start;
                int j = begin;

                while (i < array.length && j < array2.length && array[i] == array2[j]) {
                    size++;
                    i++;
                    j++;
                }

                max = Math.max(max, size);
            }
        }
        return max;
    }

    public static int[] reverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[input.length - i - 1] = input[i];
        }
        return output;
    }
}
