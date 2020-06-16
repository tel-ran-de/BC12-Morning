package imperative.homework35;

/**
 * BC12-Morning
 * 12 09 : 47
 */
public class Ls35HwArrays2_20 {
    public static void main(String[] args) {
        int[] a1 = {1, 4, 5, 6, 2}; // true
        int[] a2 = {1, 2, 3}; // true
        int[] a3 = {1, 2, 4}; // false
        int[] a4 = {1, 2, 4, 4, 5, 6}; // false
        System.out.println(tripleUp(a1));
        System.out.println(tripleUp(a2));
        System.out.println(tripleUp(a3));
        System.out.println(tripleUp(a4));
        System.out.println("Konec odin");


        System.out.println(tripleUpTwo(a1));
        System.out.println(tripleUpTwo(a2));
        System.out.println(tripleUpTwo(a3));
        System.out.println(tripleUpTwo(a4));
        System.out.println("Konec dwa");
        System.out.println(tripleUpThree(a1));
        System.out.println(tripleUpThree(a2));
        System.out.println(tripleUpThree(a3));
        System.out.println(tripleUpThree(a4));
    }


    public static boolean tripleUp(int[] array) {
        //Arrays2-20 Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
        //Дан массив, верните true, если в нем есть три увеличивающиеся подряд числа, например, 4,5,6 или 23,24,25
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 == array[i + 1] && array[i] + 2 == array[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean tripleUpTwo(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i] + 2 == array[i + 2]) return true;
        }
        return false;
    }

    private static boolean tripleUpThree(int[] array) {
        for (int i = 0; i <= array.length - 3; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                return true;
            }
        }
        return false;
    }
}