package hw44veronika;

public class ExArrays0306 {
    //veronika
    public static void main(String[] args) {
        //Мы скажем, что «зеркальная» секция в массиве - это группа смежных элементов, так что где-то в массиве эта же группа появляется в обратном порядке.
        //Например, самая большая зеркальная секция в {1, 2, 3, 8, 9, 3, 2, 1} имеет длину 3 (часть {1, 2, 3}). Возвращает размер наибольшего зеркального раздела, найденного в данном массиве.

        int[] a1 = {1, 2, 3, 8, 9, 3, 2, 1}; //3
        int[] a2 = {1, 2, 1, 4}; //3
        int[] a3 = {7, 1, 2, 9, 7, 2, 1}; //2
        int[] a4 = {5, 4, 6, 8, 9, 6, 4, 5}; //3

        System.out.println(maxMirror(a1));
        System.out.println(maxMirror(a2));
        System.out.println(maxMirror(a3));
        System.out.println(maxMirror(a4));
    }

    private static int maxMirror(int[] array) {
        int lengthOfMirror = 0;
        int one, two, three;

        for (int i = 0; i < array.length - 2; i++) {
            one = array[i];
            two = array[i + 1];
            three = array[i + 2];
            for (int j = array.length - 1; j > 1; j--) {
                if (array[j] == one && array[j - 1] == two && array[j - 2] == three) {
                    lengthOfMirror = 3;
                } else if (array[j] == one && array[j - 1] == two) {
                    lengthOfMirror = 2;
                }
            }
        }
        return lengthOfMirror;
    }
}
