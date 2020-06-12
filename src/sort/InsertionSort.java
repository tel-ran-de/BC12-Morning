package sort;

import java.util.Arrays;

/*
 * BC12-Morning
 * 12 10 : 49
 * https://www.codeflow.site/ru/article/java-insertion-sort
 * https://juja.com.ua/java/algorithms/sorting-optimizing/
 * https://www.youtube.com/watch?time_continue=7&v=ROalU379l3U&feature=emb_logo
 * https://www.youtube.com/watch?time_continue=10&v=8oJS1BMKE64&feature=emb_logo
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {22, 100, 55, 33, 88, 77, 7};
        System.out.println(Arrays.toString(insertSort(array)));
    }

    private static int[] insertSort(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int newElement = input[i]; // вспомогательная переменная, которая хранит значение
            int location = i - 1; // цикл начался не с ноля, location "наш предыдущий элемент"
            while (location >= 0 && input[location] > newElement) { // пока значение от location больше значения элемента проверки
                input[location + 1] = input[location];
                location = location - 1; // Декремент location
            }
            input[location + 1] = newElement; // передаём значение из "памяти"
        }
        return input;
    }

    public static void temp() {
        int[] a = {7, 2, 10, 4, 48, 100};  // значение элементов
        //[0,1,2,3,4,5]   ключ
        for (int k = 0; k < a.length; k++) {
            int value = a[k];
        }
        String firstName;
        String lastName;
        String middleName;
            /*
    for j = 2 to A.length do
    value = A[j]
    i = j-1
    while (i > 0 and A[i] > value) do
        A[i + 1] = A[i]
        i = i - 1
    end while
    A[i+1] = value
    end for
     */
    }
}
