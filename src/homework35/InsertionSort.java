package homework35;

import java.util.Arrays;

/**
 * BC12-Morning
 * 11 18 : 51
 */
public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("тест");
        int[] array = {22, 100, 55, 33, 88, 7};
        System.out.println(Arrays.toString(insertionSortImperative(array)));
    }

    private static int[] insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int newElement = input[i]; // временная переменная, которая хранит значение
            int location = i - 1; // цикл начался не с нуля, а с единицы - location предыдущий элемент массива
            while (location >= 0 && input[location] > newElement) { // пока значение от location больше значения элемента проверки
                input[location + 1] = input[location]; // присвоить значению на котором был элемент проверки значение предыдущего
                location = location - 1;  // Декремент  location
            }
            input[location + 1] = newElement;  // значению location+1 передаём значение из памяти
        }
        return input;
    }
}
